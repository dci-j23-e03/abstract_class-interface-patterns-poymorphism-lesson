package interfaces;

public interface Drivable {

    String NAME = "Drivable";

    void drive();

    static String getName() {
        return NAME;
    }

    default void turnAlarmOn() {
        print("The alarm is turned on!");
    }

    private void print(String message) {
        System.out.println(message);
    }
}
