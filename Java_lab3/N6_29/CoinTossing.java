package N6_29;
import java.util.Random;
import java.util.Scanner;
//6.29
public class CoinTossing {
    public enum Coin { HEADS, TAILS }

    private static final Random random = new Random();
    private static int headsCount = 0;
    private static int tailsCount = 0;

    public static Coin flip() {
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Toss a coin");
            System.out.println("2. Show results");
            System.out.println("3. Exit the program");
            int choice = input.nextInt();

            if (choice == 1) {
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                    System.out.println("Result: HEADS");
                } else {
                    tailsCount++;
                    System.out.println("Result: TAILS");
                }
            } else if (choice == 2) {
                System.out.printf("HEADS: %d%n", headsCount);
                System.out.printf("TAILS: %d%n", tailsCount);
            } else if (choice == 3) {
                System.out.println("Exit the program.");
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }
}