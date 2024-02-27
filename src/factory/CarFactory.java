package factory;

public class CarFactory {

    public static Car buildCar(CarType type) {
        Car car = null;
        switch (type) {
            case SEDAN:
                car = new SedanCar();
                car.construct();
            case SMALL:
                car = new SmallCar();
                car.construct();
            case LUXURY:
                car = new LuxuryCar();
                car.construct();
            default:
                // throw exception
                break;
        }
        return car;
    }
}
