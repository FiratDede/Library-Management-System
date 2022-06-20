package BookDbOperationsPackage;
import java.util.List;

import javax.sql.DataSource;

public interface BookDAO {
	void setDataSource(DataSource dataSource);
	void createBookTable();
	public List<Book> findBooksByName(String name);
	void addNewBook(String name,String author,int amount,int totalPage);
	void deleteBookById(int id);
	void setAmount(int bookId,int newAmount);
	

}
