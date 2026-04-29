package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter birthDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(scanner.next(), birthDateFormatter);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next().toUpperCase());

        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.print("How many items to this order? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = scanner.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        scanner.close();
    }
}
