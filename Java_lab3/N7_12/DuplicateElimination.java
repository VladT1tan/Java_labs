package N7_12;
import java.util.Scanner;
//N7.12
public class DuplicateElimination{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] uniqueNumbers = new int[5];  // Массив для хранения уникальных чисел
        int count = 0;  // Счетчик уникальных чисел

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число (от 10 до 100): ");
            int number = input.nextInt();

            // Проверка на то, что число находится в нужном диапазоне
            if (number < 10 || number > 100) {
                System.out.println("Число должно быть в диапазоне от 10 до 100. Попробуйте снова.");
                i--; // Повторяем итерацию для корректного числа
                continue;
            }

            // Проверка, является ли введенное число дубликатом
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (uniqueNumbers[j] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // Если число уникально, добавляем его в массив и увеличиваем счетчик
            if (!isDuplicate) {
                uniqueNumbers[count] = number;
                count++;

                // Вывод всех уникальных чисел
                System.out.print("Уникальные числа: ");
                for (int k = 0; k < count; k++) {
                    System.out.print(uniqueNumbers[k] + " ");
                }
                System.out.println();
            } else {
                System.out.println("Число уже было введено. Попробуйте снова.");
            }
        }
    }
}