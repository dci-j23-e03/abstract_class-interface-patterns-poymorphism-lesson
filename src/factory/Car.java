package factory;

public abstract class Car {

    private CarType model = null;

    public Car(CarType model) {
        this.model = model;
    }

    abstract void construct();
}
