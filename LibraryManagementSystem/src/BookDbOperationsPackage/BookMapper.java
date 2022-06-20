package BookDbOperationsPackage;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int count) throws SQLException {
		Book book=new Book(rs.getInt("ID"), rs.getString("NAME"), rs.getString("AUTHOR"),rs.getInt("Amount"), rs.getInt("TOTALPAGE"));
		return book ;
	}

}
