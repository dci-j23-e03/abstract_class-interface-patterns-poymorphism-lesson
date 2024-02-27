package interfaces;

public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Driving is done by burning the fuel");
    }
}
