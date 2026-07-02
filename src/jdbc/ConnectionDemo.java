package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class ConnectionDemo {

    public static void main(String[] args) {

        try {

            Connection conn = JdbcFactory.getConnection();

            System.out.println("Connection Successful");

            DatabaseMetaData meta = conn.getMetaData();

            System.out.println("DB Name : " + meta.getDatabaseProductName());
            System.out.println("DB Version : " + meta.getDatabaseProductVersion());
            System.out.println("Driver Name : " + meta.getDriverName());
            System.out.println("Driver Version : " + meta.getDriverVersion());

            conn.close();

        } catch (SQLException e) {

            System.out.println("Connection Failed");
            e.printStackTrace();

        }

    }

}