package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {

    public static void main(String[] args) {

        String sql = "select * from cust";

        try {

            Connection conn = JdbcFactory.getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("cid") + " "
                        + rs.getString("cname") + " "
                        + rs.getString("city"));

            }

            conn.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}