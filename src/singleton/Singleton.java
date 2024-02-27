package singleton;

public class Singleton {

    // 2. create static instance of your class
    private static Singleton instance = new Singleton();

    // 1. make a constructor private
    private Singleton(){}

    // 3. create method to get the instance
    public static Singleton getInstance() {
        return instance;
    }
}
