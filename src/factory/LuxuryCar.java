package factory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(CarType.LUXURY);
    }

    @Override
    void construct() {
        System.out.println("Building a Luxury car!");
    }
}
