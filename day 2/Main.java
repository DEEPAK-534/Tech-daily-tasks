package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // Create Employees
        employeeDAO.createEmployee("Alice", "HR");
        employeeDAO.createEmployee("Bob", "IT");

        // Read Employees
        List<Employee> employees = employeeDAO.readEmployees();
        System.out.println("All Employees: " + employees);

        // Update an Employee
        if (!employees.isEmpty()) {
            employeeDAO.updateEmployee(employees.get(0).getId(), "Alicia");
        }

        // Delete an Employee
        if (!employees.isEmpty()) {
            employeeDAO.deleteEmployee(employees.get(0).getId());
        }

        // Final list of employees
        System.out.println("Remaining Employees: " + employeeDAO.readEmployees());

        // Close resources
        employeeDAO.close();
    }
}