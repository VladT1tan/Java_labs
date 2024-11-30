package N8_10;

enum TrafficLight {
    RED(60),
    GREEN(45),
    YELLOW(5);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}