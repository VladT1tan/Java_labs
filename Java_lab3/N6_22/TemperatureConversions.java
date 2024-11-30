package N6_22;
import java.util.Scanner;
//6.22
public class TemperatureConversions {
    public static double Celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double Fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("...Choose an option...");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit the program");
            int choice = input.nextInt();

            if(choice == 1){
                System.out.print("Enter temperature in Fahrenheit: ");
                int temp = input.nextInt();
                System.out.printf("Temperature in Celsius: %.2f%n", Celsius(temp));
            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                int temp = input.nextInt();
                System.out.printf("Temperature in Fahrenheit: %.2f%n", Fahrenheit(temp));
            } else if (choice == 3) {
                System.out.println("Exiting the program.");
                break;
            }
            else {
                System.out.println("Invalid input.");
            }
        }
    }
}