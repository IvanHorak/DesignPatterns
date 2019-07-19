package creational.singleton.lazyloadexample;

public class DbSingletonLazyLoad {

    private static DbSingletonLazyLoad instance = null;

    private DbSingletonLazyLoad() {

    }

    public static DbSingletonLazyLoad getInstance() {
        if (instance == null) {
            instance = new DbSingletonLazyLoad();

            return instance;
        }

        return instance;
    }
}
