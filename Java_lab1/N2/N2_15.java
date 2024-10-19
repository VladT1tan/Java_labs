import java.util.Scanner;

public class N2_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();

        System.out.printf("%d + %d = %d\n", number1, number2, number1 + number2);
        System.out.printf("%d - %d = %d\n", number1, number2, number1 - number2);
        System.out.printf("%d * %d = %d\n", number1, number2, number1 * number2);
        System.out.printf("%d / %d = %d\n", number1, number2, number1 / number2);
        System.out.printf("%d %% %d = %d\n", number1, number2, number1 % number2);
    }
}