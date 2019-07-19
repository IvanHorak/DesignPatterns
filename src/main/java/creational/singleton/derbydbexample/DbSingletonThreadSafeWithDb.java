package creational.singleton.derbydbexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingletonThreadSafeWithDb {

    private volatile static DbSingletonThreadSafeWithDb instance = null; //add volatile so that the value is always written to main memory instead of cache
    private static volatile Connection conn = null;

    private DbSingletonThreadSafeWithDb() {

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (conn != null) {
            throw new RuntimeException("Use getConnection() method to create!");
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create!");
        }
    }

    public static DbSingletonThreadSafeWithDb getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafeWithDb.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafeWithDb();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingletonThreadSafeWithDb.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
}
