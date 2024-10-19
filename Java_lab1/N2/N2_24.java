import java.util.Scanner;

public class N2_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();
        System.out.print("Enter Fourth Number: ");
        int num4 = input.nextInt();
        System.out.print("Enter Fifth Number: ");
        int num5 = input.nextInt();

        int min = num1;
        int max = num1;

        int[] numbers = {num1, num2, num3, num4, num5};

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("The Number " + max + " is the Greater Number");
        System.out.println("The Number " + min + " is the Smallest Number");
    }
}