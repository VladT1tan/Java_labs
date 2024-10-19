package N4_24;

import java.util.Scanner;

public class ValidUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;

        while (input != 1 && input != 2) {
            System.out.print("Please enter 1 or 2: ");
            input = scanner.nextInt();

            if (input != 1 && input != 2) {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println("Thank you! You entered: " + input);
    }
}