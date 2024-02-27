package abstractclasses;

// we are not implementing area() method here, but had to define a class as abstract
// that would mean we will provide implementation sometimes later, in some child class
public abstract class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
}
