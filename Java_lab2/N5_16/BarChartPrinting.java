package N5_16;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            int number;

            do {
                System.out.print("Enter number " + (i + 1) + " (between 1 and 30): ");
                number = input.nextInt();

                if (number < 1 || number > 30) {
                    System.out.println("Invalid input! Please enter a number between 1 and 30.");
                }
            } while (number < 1 || number > 30);

            numbers[i] = number;
        }

        System.out.println("\nBar Chart:");

        for (int number : numbers) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}