package factory;

public class Main {

    public static void main(String[] args) {


        Car sedan = CarFactory.buildCar(CarType.SEDAN);
    }
}
