package N7_16;

public class UsingTheEnhancedForStatement {
    public static void main(String[] args) {
        double sum = 0.0;

        // Enhanced for loop для суммирования значений
        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg); // Преобразование строки в double
                sum += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid double.");
            }
        }

        System.out.println("Sum of arguments: " + sum);
    }
}