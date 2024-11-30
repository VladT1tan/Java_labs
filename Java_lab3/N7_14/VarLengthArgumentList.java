package N7_14;
//7.14
public class VarLengthArgumentList {
    public static int product(int... numbers) {
        int result = 1;

        for (int number : numbers) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.printf("Произведение (5, 5): %d%n", product(2, 3));
        System.out.printf("Произведение (1, 2, 3): %d%n", product(1, 4, 5));
        System.out.printf("Произведение (9, 1, 7, 2): %d%n", product(7, 2, 3, 4));
        System.out.printf("Произведение (10): %d%n", product(10));
        System.out.printf("Произведение (без аргументов): %d%n", product());
    }
}