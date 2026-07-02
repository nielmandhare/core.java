package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class CallableDemo {

    public static void main(String[] args) {

        try {

            Connection conn = JdbcFactory.getConnection();

            // Calling MySQL function: get_name(cid)
            CallableStatement stmt =
                    conn.prepareCall("{? = call get_name(?)}");

            // Input parameter
            stmt.setInt(2, 12);

            // Register return value
            stmt.registerOutParameter(1, Types.VARCHAR);

            // Execute function
            stmt.execute();

            // Print returned value
            System.out.println("Name : " + stmt.getString(1));

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }
    }
}