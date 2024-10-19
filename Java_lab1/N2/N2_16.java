import java.util.Scanner;

public class N2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 is greater than number 2");
        }
        else if (number1 < number2) {
            System.out.println("Number 2 is greater than number 1");
        }
        else {
            System.out.println("Number 1 is equal to number 2");
        }
    }
}