package creational.singleton.derbydbexample;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RunSingletonPatternThreadSafeWithDbExample {
    public static void main(String[] args) {
        DbSingletonThreadSafeWithDb singleton = DbSingletonThreadSafeWithDb.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        timeBefore = System.currentTimeMillis();
        Connection conn = singleton.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);

        Statement stmt;
        try {
            stmt = conn.createStatement();
            int count = stmt.executeUpdate("CREATE TABLE Garage (ID INT, Car VARCHAR(30), Type VARCHAR(15))");
            System.out.println("Table created!");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = singleton.getConnection();
        timeAfter = System.currentTimeMillis();

        System.out.println(timeAfter - timeBefore);
    }
}
