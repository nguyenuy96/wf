package sample.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sample.dto.BookDto;

public class BookDao extends JdbcDao {
    public List<BookDto> getBooks() {
        List<BookDto> list = new ArrayList<>();
        try (Connection connection = getConnection()){
            String sql = "SELECT * from book_view";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                BookDto bookDto = new BookDto();
                bookDto.setBookId(rs.getString("book_id"));
                bookDto.setBookName(rs.getString("name"));
                bookDto.setAuthor(rs.getString("author"));
                bookDto.setTotal(rs.getInt("total"));
                bookDto.setRemain(Math.max(rs.getInt("remain"), 0));
                list.add(bookDto);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return list;
    }
}
