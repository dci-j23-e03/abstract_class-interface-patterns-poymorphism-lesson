package singleton;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.equals(singleton2));

//        Singleton singleton3 = new Singleton();
//        Singleton singleton4 = new Singleton();
//        System.out.println(singleton3.equals(singleton4));
    }
}
