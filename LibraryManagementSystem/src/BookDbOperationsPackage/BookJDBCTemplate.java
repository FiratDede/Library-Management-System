package BookDbOperationsPackage;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookJDBCTemplate implements BookDAO{
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		jdbcTemplate=new JdbcTemplate(dataSource);
		createBookTable();
		
	}

	@Override
	public void createBookTable() {
		try{
			String sql= "CREATE TABLE Book(\r\n"
					+ "   ID   INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "   NAME VARCHAR(126) NOT NULL,\r\n"
					+ "    AUTHOR VARCHAR(126) NOT NULL, \r\n " 
					+ "   AMOUNT  INT NOT NULL,\r\n"
					+ "   TOTALPAGE  INT NOT NULL,\r\n"
					+" CONSTRAINT uc_name_author Unique(NAME, AUTHOR),\r\n  "
					+ "   PRIMARY KEY (ID)\r\n"	
					+ ")";
			this.jdbcTemplate.execute(sql);
		}
		catch( Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
	}
	@Override
	public List<Book> findBooksByName(String name) {
		String sql= "Select * from book where name=?";
		List<Book> books=jdbcTemplate.query(sql, new BookMapper(),name);
		return books;
	}
	
	
	
	@Override
	public void addNewBook(String name, String author, int amount, int totalPage) {
		String sql="Insert into book(NAME,AUTHOR,AMOUNT,TOTALPAGE ) values (?,?,?,?)";
		jdbcTemplate.update(sql,name,author,amount,totalPage);
		
	}
	

	@Override
	public void deleteBookById(int id) {
		String sql="Delete from book where ID=? ";
		jdbcTemplate.update(sql,id);
		
	}

	@Override
	public void setAmount(int bookId,int newAmount) {
		String sql="Update book SET AMOUNT=?  WHERE ID=?";
		jdbcTemplate.update(sql,newAmount,bookId);
		
	}
	

	
	
	
	
}
