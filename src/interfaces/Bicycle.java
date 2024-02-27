package interfaces;

public class Bicycle implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driving is done by turning the pedals!");
    }

    @Override
    public void turnAlarmOn() {
        System.out.println("The bicycle doesn't have an alarm!");
    }

    public void test() {
        System.out.println("This is test method in Bicycle class");
    }
}
