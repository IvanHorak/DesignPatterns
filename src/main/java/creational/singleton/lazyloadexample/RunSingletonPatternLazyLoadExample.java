package creational.singleton.lazyloadexample;

public class RunSingletonPatternLazyLoadExample {
    public static void main(String[] args) {
        DbSingletonLazyLoad singleton = DbSingletonLazyLoad.getInstance();

        System.out.println(singleton);

        DbSingletonLazyLoad otherSingleton = DbSingletonLazyLoad.getInstance();

        System.out.println(otherSingleton);
    }
}
