package N8_8;

public class EnhancingDate {
    private int month;
    private int day;
    private int year;

    public EnhancingDate(int month, int day, int year) {
        if (!isValidDate(month, day, year)) {
            throw new IllegalArgumentException("Invalid date provided.");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private static boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12 || year < 1) {
            return false; // Некорректный месяц или год
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[2] = 29; // Февраль в високосный год
        }

        return day >= 1 && day <= daysInMonth[month];
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Увеличиваем день на 1
    public void nextDay() {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        if (day < daysInMonth[month]) {
            day++; // Переход на следующий день в пределах месяца
        } else {
            day = 1; // Переход на следующий месяц
            if (month < 12) {
                month++;
            } else {
                month = 1; // Переход на следующий год
                year++;
            }
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }

    public static void main(String[] args) {
        //Переход в следующий месяц
        System.out.println("Testing incrementing into the next month:");
        EnhancingDate date1 = new EnhancingDate(1, 31, 2024); // 31 января 2024
        for (int i = 0; i < 3; i++) {
            System.out.println(date1);
            date1.nextDay();
        }

        //Переход в следующий год
        System.out.println("\nTesting incrementing into the next year:");
        EnhancingDate date2 = new EnhancingDate(12, 30, 2024); // 30 декабря 2024
        for (int i = 0; i < 3; i++) {
            System.out.println(date2);
            date2.nextDay();
        }

        //Високосный год
        System.out.println("\nTesting leap year:");
        EnhancingDate date3 = new EnhancingDate(2, 28, 2024); // 28 февраля 2024
        for (int i = 0; i < 3; i++) {
            System.out.println(date3);
            date3.nextDay();
        }
    }
}