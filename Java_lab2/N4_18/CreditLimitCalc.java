package N4_18;

import java.util.Scanner;

public class CreditLimitCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountNumber;
        int beginningBalance;
        int totalCharges;
        int totalCredits;
        int creditLimit;
        int newBalance;

        while (true) {
            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();

            if (accountNumber == -1) {
                break;
            }

            System.out.print("Enter balance at the beginning of the month: ");
            beginningBalance = input.nextInt();

            System.out.print("Enter total of all charges this month: ");
            totalCharges = input.nextInt();

            System.out.print("Enter total of all credits this month: ");
            totalCredits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            creditLimit = input.nextInt();

            newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println();
        }

        System.out.println("Program ended.");
    }
}