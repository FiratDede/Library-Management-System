package BorrowedBookDbOperationsPackage;

import java.sql.Date;
import java.util.List;

import javax.sql.DataSource;

import CustomerDbOperationsPackage.Customer;

public interface BorrowedBookDAO {
	void setDataSource(DataSource dataSource);
	void createBorrowedBookTable();
	void addBorrowedBook(int bookId,int customerId, Date issueDate, Date dueDate);
	List<DetailedBorrowedBookInfo> getPenalizedCustomersInfo();
}
