import java.util.Scanner;
import java.lang.Math;

public class N2_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = input.nextDouble();

        System.out.printf("Diameter of a circle: %.2f%n", 2 * radius);
        System.out.printf("Circumference of a circle: %.2f%n", 2 * Math.PI * radius);
        System.out.printf("Area of a circle: %.2f%n", Math.PI * (radius * radius));
    }
}