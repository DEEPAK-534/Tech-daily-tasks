package com.example;

import jakarta.persistence.*;
import java.util.List;

public class EmployeeDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    public void createEmployee(String name, String department) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Employee employee = new Employee(name, department);
            em.persist(employee); // CREATE
            transaction.commit();
            System.out.println("Employee created: " + employee);
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public List<Employee> readEmployees() {
        EntityManager em = emf.createEntityManager();
        List<Employee> employees = em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList(); // READ
        em.close();
        return employees;
    }

    public void updateEmployee(Long id, String newName) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Employee employee = em.find(Employee.class, id);
            if (employee != null) {
                employee.setName(newName);
                em.merge(employee); // UPDATE
                System.out.println("Employee updated: " + employee);
            } else {
                System.out.println("Employee not found");
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void deleteEmployee(Long id) {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try {
            transaction.begin();
            Employee employee = em.find(Employee.class, id);
            if (employee != null) {
                em.remove(employee); // DELETE
                System.out.println("Employee deleted: " + employee);
            } else {
                System.out.println("Employee not found");
            }
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

    public void close() {
        emf.close();
    }
}