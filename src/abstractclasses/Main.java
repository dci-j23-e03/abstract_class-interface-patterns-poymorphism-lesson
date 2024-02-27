package abstractclasses;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape someShape = new Triangle(5, 7);
        Shape someOtherShape = new Rectangle(5, 10);
        System.out.println("someShape is " + someShape.getName());
        System.out.println("someOtherShape is " + someOtherShape.getName());

        List<Integer> someList = new ArrayList<>();
    }
}