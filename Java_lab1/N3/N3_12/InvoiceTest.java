package N3_12;

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input details for the invoice
        System.out.print("Enter part number: ");
        String number = input.nextLine();

        System.out.print("Enter part description: ");
        String description = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        // Create an Invoice object
        Invoice invoice = new Invoice(number, description, quantity, price);

        // Display the invoice details and total amount
        System.out.println("\nInvoice Details:");
        System.out.println("Part Number: " + invoice.getNumber());
        System.out.println("Part Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPrice());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
