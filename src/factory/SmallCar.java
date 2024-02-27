package factory;

public class SmallCar extends Car {
    public SmallCar() {
        super(CarType.SMALL);
    }

    @Override
    void construct() {
        System.out.println("Building the Small car!");
    }
}
