package BorrowedBookDbOperationsPackage;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import CustomerDbOperationsPackage.Customer;

public class BorrowedBookJDBCTemplate implements BorrowedBookDAO {
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		System.out.println("JDBC template is "+jdbcTemplate);
		createBorrowedBookTable();
	}

	@Override
	public void createBorrowedBookTable() {
		try {
		String sql="CREATE TABLE BorrowedBook(\r\n"
				 + " ID INT NOT NULL AUTO_INCREMENT,\r\n"
				 + " BOOKID INT NOT NULL ,\r\n"
				 + " CUSTOMERID INT NOT NULL ,\r\n"
				 + " ISSUEDATE DATE NOT NULL ,\r\n"
				 + " DUEDATE DATE NOT NULL ,\r\n"
				 + " PRIMARY KEY (ID) ,\r\n"
				 + " FOREIGN KEY (BOOKID) REFERENCES BOOK(ID) ,\r\n"
				 +" FOREIGN KEY (CUSTOMERID) REFERENCES CUSTOMER(ID))";
		this.jdbcTemplate.execute(sql);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void addBorrowedBook(int bookId,int customerId, Date issueDate, Date dueDate) {
		String sql="Insert into BorrowedBook(BOOKID,CUSTOMERID,ISSUEDATE,DUEDATE) values (?,?,?,?)";
		this.jdbcTemplate.update(sql,bookId,customerId,issueDate,dueDate);
		
	}

	@Override
	public List<DetailedBorrowedBookInfo> getPenalizedCustomersInfo() {
		String sql="Select borrowedbook.Id,customer.SOCIALSECURITYID, customer.name as CustomerName,customer.SURNAME as CustomerSurname,book.NAME as BookName, book.Author as BookAuthor , borrowedbook.IssueDate,borrowedbook.DUEDATE, datediff(curDate(),borrowedbook.DUEDATE) as DelayedDayCount  from customer,borrowedbook,book \r\n"
				+ " where  curdate()> borrowedbook.DueDate and customer.ID= borrowedbook.CUSTOMERID and borrowedbook.BOOKID= book.ID";
		List<DetailedBorrowedBookInfo> info= jdbcTemplate.query(sql, new DetailedBorrowedBookInfoMapper());
		return info;
	}
	

	
	
	

}
