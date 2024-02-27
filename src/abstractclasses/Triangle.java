package abstractclasses;

public class Triangle extends Shape {

    private int length;
    private int width;

    public Triangle(int length, int width) {
        super("Triangle");
        this.length = length;
        this.width = width;
    }

    @Override
    protected int area() {
        return (length * width) / 2;
    }
}
