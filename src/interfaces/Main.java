package interfaces;

public class Main {

    public static void main(String[] args) {

        Drivable car = new Car();
        car.drive();
        car.turnAlarmOn();
        Drivable bicycle = new Bicycle(); // usage of parent reference type, so polymorphism will be in place
        bicycle.drive();
        bicycle.turnAlarmOn(); // will call the method from Bicycle class, JVM decides this in run-time
//        bicycle.test();
        System.out.println(Bicycle.NAME);
    }
}
