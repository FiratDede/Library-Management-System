package CustomerDbOperationsPackage;
import java.util.List;

import javax.sql.DataSource;

public interface CustomerDAO {
 
	void setDataSource(DataSource dataSource);
	void addNewCustomer (String socialSecurityId,String name,String surname, int age );
	Customer findCustomerById(int id);
	List<Customer> findCustomersByName(String name);
	void deleteCustomerById(int id);
	
	void createCustomerTable();
 

}
