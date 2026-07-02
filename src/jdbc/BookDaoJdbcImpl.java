package com.mmcoe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Optional;

import com.mmcoe.model.Book;
import jdbc.JdbcFactory;

public class BookDaoJdbcImpl implements BookDao {

    @Override
    public boolean save(Book b) {

        String sql = "insert into books values (?, ?, ?, ?)";

        try {
            Connection conn = JdbcFactory.getConnection();

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, b.getIsbn());
            stmt.setString(2, b.getTitle());
            stmt.setString(3, b.getAuthor());
            stmt.setDouble(4, b.getPrice());

            stmt.executeUpdate();

            stmt.close();
            conn.close();

            return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Optional<Book> find(int isbn) {

        String sql = "select * from books where isbn=" + isbn;

        return Optional.empty();
    }

}