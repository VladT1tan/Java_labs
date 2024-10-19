package N5_11;

import java.util.Scanner;

public class FindSmallestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values you will input: ");
        int numberOfValues = input.nextInt();

        System.out.print("Enter number 1: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= numberOfValues; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The smallest number is: " + smallest);
    }
}