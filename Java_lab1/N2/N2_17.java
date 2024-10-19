import java.util.Scanner;

public class N2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is " + average);

        if(number1 > number2 && number1 > number3){
            System.out.println("The number 1 is greatest number");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println("The number 2 is greatest number");
        }
        else if(number3 > number1 && number3 > number2){
            System.out.println("The number 3 is greatest number");
        }

        if(number1 < number2 && number2 < number3){
            System.out.println("The number 1 is smallest number");
        }
        else if(number2 < number1 && number2 < number3){
            System.out.println("The number 2 is smallest number");
        }
        else if(number3 < number1 && number3 < number2){
            System.out.println("The number 3 is smallest number");
        }
    }
}