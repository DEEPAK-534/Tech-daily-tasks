package p1;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        EmployeeOperations operations = new EmployeeOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();
                    operations.addEmployee(name, email, salary);
                    break;
                case 2:
                    System.out.print("Enter name or email to search: ");
                    String searchTerm = sc.nextLine();
                    operations.searchEmployee(searchTerm);
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();
                    operations.updateEmployeeSalary(id, newSalary);
                    break;
                case 4:
                    operations.closeConnection();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}