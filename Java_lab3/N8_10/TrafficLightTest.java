package N8_10;

public class TrafficLightTest {
    public static void main(String[] args) {
        System.out.println("Traffic Light Durations:");

        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d seconds%n", light.name(), light.getDuration());
        }
    }
}