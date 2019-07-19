package creational.singleton.threadsafeexample;

public class RunSingletonPatternThreadSafeExample {
    public static void main(String[] args) {
        DbSingletonThreadSafe singleton = DbSingletonThreadSafe.getInstance();

        System.out.println(singleton);

        DbSingletonThreadSafe otherSingleton = DbSingletonThreadSafe.getInstance();

        System.out.println(otherSingleton);
    }
}
