package p1;

import java.sql.*;

public class EmployeeOperations {
    private Connection con;

    public EmployeeOperations() {
        con = DBConnection.getConnection();
    }

    // Add an employee record
    public void addEmployee(String name, String email, double salary) {
        String query = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Search employees based on name or email
    public void searchEmployee(String searchTerm) {
        String query = "SELECT * FROM employees WHERE name LIKE ? OR email LIKE ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            String searchPattern = "%" + searchTerm + "%"; // Allows partial matching
            ps.setString(1, searchPattern);
            ps.setString(2, searchPattern);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.printf("ID: %d, Name: %s, Email: %s, Salary: %.2f%n",
                        rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update the salary of an employee
    public void updateEmployeeSalary(int id, double salary) {
        String query = "UPDATE employees SET salary=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setDouble(1, salary);
            ps.setInt(2, id);
            int rowsUpdated = ps.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Employee salary updated successfully!");
            } else {
                System.out.println("Employee not found!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Close the database connection
    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}