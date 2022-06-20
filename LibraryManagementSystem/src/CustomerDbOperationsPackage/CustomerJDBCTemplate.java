package CustomerDbOperationsPackage;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerJDBCTemplate implements CustomerDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		createCustomerTable();
		
	}
	@Override
	public void addNewCustomer(String socialSecurityId,String name, String surname, int age) {
		
		String sql= "INSERT INTO Customer(socialSecurityId,name,surname,age) VALUES (?,?,?,?)  ";
		
		int count=this.jdbcTemplate.update(sql,socialSecurityId,name,surname,age);
		
	}
	@Override
	public Customer findCustomerById(int id) {
		try {
		String sql="Select * from customer where id=?";
		Customer selectedCustomer= jdbcTemplate.queryForObject(sql, new CustomerMapper(),id);
		
		return selectedCustomer;
		}
		catch(org.springframework.dao.EmptyResultDataAccessException exception) 
		{
		return null;
		}
	}
	
	@Override
	public List<Customer> findCustomersByName(String name) {
		String sql="Select * from customer where name=?";
		List<Customer> customers=jdbcTemplate.query(sql, new CustomerMapper(),name);
		return customers;
		
	}
	public void deleteCustomerById(int id) {
		String sql="Delete from customer where id=?";
		jdbcTemplate.update(sql,id);
	}
	
	
	@Override
	public void createCustomerTable() {
		try{
			String sql= "CREATE TABLE Customer(\r\n"
					+ "   ID   INT NOT NULL AUTO_INCREMENT,\r\n"
					+ "   SOCIALSECURITYID   VARCHAR(126) NOT NULL,\r\n"
					+ "   NAME VARCHAR(126) NOT NULL,\r\n"
					+ "    SURNAME VARCHAR(126) NOT NULL, \r\n " 
					+ "   AGE  INT NOT NULL,\r\n"
					+ "   PRIMARY KEY (ID),\r\n"
					+ "   UNIQUE (SOCIALSECURITYID)\r\n"
					+ ")";
			this.jdbcTemplate.execute(sql);
		}
		catch( Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	
	
	

}
