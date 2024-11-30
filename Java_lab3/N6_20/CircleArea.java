package N6_20;
import java.util.Scanner;
import java.lang.Math;
//N6.20
public class CircleArea {
    public static void circleArea(double radius){
        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("Area of circle is: %.2f", area);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of circle: ");
        double radius = input.nextInt();

        circleArea(radius);
    }
}
