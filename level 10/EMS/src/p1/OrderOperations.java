package p1;

import java.sql.*;

public class OrderOperations {
    private Connection con;

    public OrderOperations() {
        con = DBConnection.getConnection();
    }

    // Add a new order
    public void addOrder(String productName, String customerName, int quantity, double price, String status) {
        String query = "INSERT INTO orders (product_name, customer_name, quantity, price, status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, productName);
            ps.setString(2, customerName);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);
            ps.setString(5, status);
            ps.executeUpdate();
            System.out.println("Order added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve order by ID
    public void getOrderById(int id) {
        String query = "SELECT * FROM orders WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Product: " + rs.getString("product_name"));
                System.out.println("Customer: " + rs.getString("customer_name"));
                System.out.println("Quantity: " + rs.getInt("quantity"));
                System.out.println("Price: " + rs.getDouble("price"));
                System.out.println("Status: " + rs.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update order status
    public void updateOrderStatus(int id, String status) {
        String query = "UPDATE orders SET status=? WHERE id=?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
            System.out.println("Order status updated!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete canceled orders
    public void deleteCanceledOrders() {
        String query = "DELETE FROM orders WHERE status='Canceled'";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            int rows = ps.executeUpdate();
            System.out.println(rows + " canceled orders deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Display all orders
    public void displayAllOrders() {
        String query = "SELECT * FROM orders";
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.printf("ID: %d, Product: %s, Customer: %s, Quantity: %d, Price: %.2f, Status: %s%n",
                        rs.getInt("id"), rs.getString("product_name"), rs.getString("customer_name"),
                        rs.getInt("quantity"), rs.getDouble("price"), rs.getString("status"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Close the connection
    public void closeConnection() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}