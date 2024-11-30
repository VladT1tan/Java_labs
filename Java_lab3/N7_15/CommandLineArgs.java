package N7_15;
//7.15
public class CommandLineArgs {

    public static void main(String[] args) {
        // Установка размера массива по умолчанию
        int arraySize = 10;

        // Проверка на наличие аргумента командной строки
        if (args.length > 0) {
            try {
                // Пробуем преобразовать первый аргумент к целому числу
                arraySize = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат аргумента. Используется размер массива по умолчанию: 10.");
            }
        }

        // Инициализация массива с заданным размером
        int[] array = new int[arraySize];

        // Заполнение массива значениями и вывод
        System.out.println("Индекс\tЗначение");
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;  // Заполняем массив (например, четными числами)
            System.out.println(i + "\t\t" + array[i]);
        }
    }
}