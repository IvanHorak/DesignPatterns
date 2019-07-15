package creational.singleton;

public class Calculator {

    private static Calculator instance;

    private Calculator() {
    }

    public int add(int n1, int n2) {
        return n1 + n1;
    }

    public static synchronized Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }
}
