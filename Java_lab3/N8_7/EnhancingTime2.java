package N8_7;

public class EnhancingTime2 {
    private int totalSeconds;

    public EnhancingTime2() {
        this(0, 0, 0);
    }

    public EnhancingTime2(int hour) {
        this(hour, 0, 0);
    }

    public EnhancingTime2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public EnhancingTime2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute, and/or second out of range");
        }
        totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public int getHour() {
        return totalSeconds / 3600;
    }

    public int getMinute() {
        return (totalSeconds % 3600) / 60;
    }

    public int getSecond() {
        return totalSeconds % 60;
    }

    //Увеличиваем на одну секунду
    public void tick() {
        totalSeconds = (totalSeconds + 1) % 86400; // Переходит на 0 после 24:00:00
    }

    //На минуту
    public void incrementMinute() {
        totalSeconds += 60;
        totalSeconds %= 86400;
    }

    //На один час
    public void incrementHour() {
        totalSeconds += 3600;
        totalSeconds %= 86400;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public static void main(String[] args) {
        EnhancingTime2 time = new EnhancingTime2(23, 59, 59);
        System.out.println("Initial time: " + time.toUniversalString());

        time.tick();
        System.out.println("After tick: " + time.toUniversalString());

        // Установка времени для теста incrementMinute
        time.setTime(12, 59, 59);
        System.out.println("\nTime before incrementMinute: " + time.toUniversalString());
        time.incrementMinute();
        System.out.println("After incrementMinute: " + time.toUniversalString());

        // Установка времени для теста incrementHour
        time.setTime(23, 0, 0);
        System.out.println("\nTime before incrementHour: " + time.toUniversalString());
        time.incrementHour();
        System.out.println("After incrementHour: " + time.toUniversalString());

        // Тестируем переход в следующий день
        time.setTime(23, 59, 59);
        System.out.println("\nTime before tick to next day: " + time.toUniversalString());
        time.tick();
        System.out.println("After tick to next day: " + time.toUniversalString());
    }
}