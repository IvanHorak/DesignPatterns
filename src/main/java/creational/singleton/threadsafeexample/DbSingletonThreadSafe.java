package creational.singleton.threadsafeexample;

public class DbSingletonThreadSafe {

    private volatile static DbSingletonThreadSafe instance = null; //add volatile so that the value is always written to main memory instead of cache

    private DbSingletonThreadSafe() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        }

        return instance;
    }
}
