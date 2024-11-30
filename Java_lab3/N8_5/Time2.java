package N8_5;
public class Time2 {
    private int totalSeconds;

    // Конструкторы
    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour) {
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute, and/or second out of range");
        }
        totalSeconds = hour * 3600 + minute * 60 + second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }
        totalSeconds = hour * 3600 + getMinute() * 60 + getSecond();
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }
        totalSeconds = getHour() * 3600 + minute * 60 + getSecond();
    }

    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }
        totalSeconds = getHour() * 3600 + getMinute() * 60 + second;
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

    //24-часовой формат
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    //12-часовой формат
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(10, 28, 3);
        Time2 t3 = new Time2(23, 59, 59);

        System.out.println("Constructed Times:");
        System.out.println("t1: " + t1.toUniversalString());
        System.out.println("t2: " + t2.toUniversalString());
        System.out.println("t3: " + t3.toUniversalString());

        t1.setTime(6, 30, 15);
        System.out.println("\nAfter changing t1:");
        System.out.println("t1: " + t1.toUniversalString());

        System.out.println("\n12-hour format:");
        System.out.println("t2: " + t2);
    }
}