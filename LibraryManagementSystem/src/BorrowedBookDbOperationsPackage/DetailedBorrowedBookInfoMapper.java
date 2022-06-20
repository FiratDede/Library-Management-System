package BorrowedBookDbOperationsPackage;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DetailedBorrowedBookInfoMapper implements RowMapper<DetailedBorrowedBookInfo> {

	@Override
	public DetailedBorrowedBookInfo mapRow(ResultSet rs, int count) throws SQLException {
		DetailedBorrowedBookInfo detailedBorrowedBookInfo= new DetailedBorrowedBookInfo(rs.getInt("ID"), rs.getString("SocialSecurityId")
				, rs.getString("CustomerName"), rs.getString("CustomerSurname"), rs.getString("BookName"), 
				rs.getString("BookAuthor"), rs.getDate("IssueDate"), rs.getDate("DueDate"), rs.getInt("DelayedDayCount"));
		return detailedBorrowedBookInfo;
	}
	

}
