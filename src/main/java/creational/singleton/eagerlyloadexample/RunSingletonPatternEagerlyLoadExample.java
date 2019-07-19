package creational.singleton.eagerlyloadexample;

public class RunSingletonPatternEagerlyLoadExample {
    public static void main(String[] args) {
        DbSingletonEagerLoad singleton = DbSingletonEagerLoad.getInstance();

        System.out.println(singleton);

        DbSingletonEagerLoad otherSingleton = DbSingletonEagerLoad.getInstance();

        System.out.println(otherSingleton);
    }
}
