package learning;

import creational.singleton.Calculator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator calc = null;
        printObject(calc);

        calc = Calculator.getInstance();
        printObject(calc);

        calc = Calculator.getInstance();
        printObject(calc);
    }

    private static void printObject(Calculator calc) {
        System.out.println("Calc is:" + calc);
    }
}
