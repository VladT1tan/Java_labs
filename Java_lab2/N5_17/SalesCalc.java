package N5_17;

import java.util.Scanner;

public class SalesCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productNumber;
        int quantity;
        double totalRetailValue = 0.0;

        while (true) {
            System.out.print("Enter product number (1-5, or 0 to exit): ");
            productNumber = input.nextInt();

            if (productNumber == 0) {
                break;
            }

            if (productNumber < 1 || productNumber > 5) {
                System.out.println("Invalid product number! Please enter a number between 1 and 5.");
                continue;
            }

            System.out.print("Enter quantity sold: ");
            quantity = input.nextInt();

            double price = 0.0;
            switch (productNumber) {
                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number.");
                    continue;
            }
            totalRetailValue += price * quantity;
        }
        System.out.printf("Total retail value of all products sold: $%.2f%n", totalRetailValue);
    }
}