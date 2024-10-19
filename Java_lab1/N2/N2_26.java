import java.util.Scanner;

public class N2_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();

        if(a % b == 0){
            System.out.println("Number \"a\" is a multiple of \"b\"");
        }
        else{
            System.out.println("Number \"a\" is not a multiple of \"b\"");
        }
    }
}