package factory;

public class SedanCar extends Car {
    public SedanCar() {
        super(CarType.SEDAN);
    }

    @Override
    void construct() {
        System.out.println("Building the Sedan car!");
    }
}
