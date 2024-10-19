package N4_19;

import java.util.Scanner;

public class SalesCommissionCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double item1Value = 239.99;
        double item2Value = 129.75;
        double item3Value = 99.95;
        double item4Value = 350.89;

        double baseSalary = 200.0;
        double commissionRate = 0.09;

        double totalSales = 0.0;
        int itemNumber;

        System.out.println("Enter the item number sold by the salesperson (enter -1 to stop):");

        while (true) {
            System.out.print("Enter item number (1-4) or -1 to finish: ");
            itemNumber = input.nextInt();

            if (itemNumber == -1) {
                break;
            }

            switch (itemNumber) {
                case 1:
                    totalSales += item1Value;
                    break;
                case 2:
                    totalSales += item2Value;
                    break;
                case 3:
                    totalSales += item3Value;
                    break;
                case 4:
                    totalSales += item4Value;
                    break;
                default:
                    System.out.println("Invalid item number. Please enter a number between 1 and 4.");
            }
        }

        double commission = totalSales * commissionRate;
        double totalEarnings = baseSalary + commission;

        System.out.printf("Total sales: $%.2f%n", totalSales);
        System.out.printf("Total earnings: $%.2f%n", totalEarnings);
    }
}