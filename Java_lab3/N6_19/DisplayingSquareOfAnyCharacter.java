package N6_19;
import java.util.Scanner;
// N6.19
public class DisplayingSquareOfAnyCharacter {
    public static void squareOfCharacter(int side, char fill){
        for (int i = 0; i < side; i++){
           for (int j = 0; j < side; j++){
               System.out.print(fill);
           }
           System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int side = input.nextInt();

        System.out.print("Enter a character: ");
        char fill = input.next().charAt(0);

        squareOfCharacter(side, fill);
    }
}
