package creational.singleton.eagerlyloadexample;

public class DbSingletonEagerLoad {

    private static DbSingletonEagerLoad instance = new DbSingletonEagerLoad();

    private DbSingletonEagerLoad() {

    }

    public static DbSingletonEagerLoad getInstance() {
        return instance;
    }
}
