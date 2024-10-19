package N3_14;

public class DateTest {
    public static void main(String[] args) {
        Date myDate = new Date(6, 20, 2020);

        System.out.printf("Initial Date:%n%d-%d-%d%n", myDate.getMonth(), myDate.getDay(), myDate.getYear());

        myDate.setMonth(12);
        myDate.setDay(31);
        myDate.setYear(2024);

        System.out.println("\nModified Date:");
        myDate.displayDate();
    }
}