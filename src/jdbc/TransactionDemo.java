package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

    public static void main(String[] args) {

        Connection conn = null;

        // DML Queries
        String sql1 = "insert into cust values (15, 'Nik', 'Noida')";
        String sql2 = "update cust set city='Madurai' where cid=11";
        String sql3 = "delete from cust where cid=14";

        try {

            // Get connection
            conn = JdbcFactory.getConnection();

            // Turn off auto commit
            conn.setAutoCommit(false);

            // Create Statement
            Statement stmt = conn.createStatement();

            // Add queries to batch
            stmt.addBatch(sql1);
            stmt.addBatch(sql2);
            stmt.addBatch(sql3);

            // Execute batch
            stmt.executeBatch();

            // Commit transaction
            conn.commit();

            System.out.println("Transaction completed");

            stmt.close();
            conn.close();

        } catch (SQLException e) {

            System.out.println("Transaction failed");

            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Rollback successful");
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

            e.printStackTrace();
        }
    }
}