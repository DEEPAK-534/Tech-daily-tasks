package p1;

import java.util.Scanner;

public class ECommerceOrderManagement {
    public static void main(String[] args) {
        OrderOperations operations = new OrderOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nE-Commerce Order Management System");
            System.out.println("1. Add Order");
            System.out.println("2. View Order by ID");
            System.out.println("3. Update Order Status");
            System.out.println("4. Delete Canceled Orders");
            System.out.println("5. Display All Orders");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Product Name: ");
                    String product = sc.next();
                    System.out.print("Customer Name: ");
                    String customer = sc.next();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Status: ");
                    String status = sc.next();
                    operations.addOrder(product, customer, quantity, price, status);
                    break;
                case 2:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    operations.getOrderById(id);
                    break;
                case 3:
                    System.out.print("Order ID: ");
                    id = sc.nextInt();
                    System.out.print("New Status: ");
                    status = sc.next();
                    operations.updateOrderStatus(id, status);
                    break;
                case 4:
                    operations.deleteCanceledOrders();
                    break;
                case 5:
                    operations.displayAllOrders();
                    break;
                case 6:
                    operations.closeConnection();
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}