package N6_26;
import java.util.Scanner;
//6.26
public class ReversingDigits {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to reverse digits: ");
        int number = input.nextInt();
        System.out.printf("ReversedNumber: %d", reverse(number));
    }
}