package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataDemo {

    public static void main(String[] args) {

        try {

            Connection conn = JdbcFactory.getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select * from cust");

            ResultSetMetaData meta = rs.getMetaData();

            System.out.println("Number of Columns : " + meta.getColumnCount());

            while(rs.next()) {

                for(int i=1;i<=meta.getColumnCount();i++)
                    System.out.print(rs.getString(i)+" ");

                System.out.println();
            }

            conn.close();

        }
        catch(SQLException e) {
            e.printStackTrace();
        }

    }

}