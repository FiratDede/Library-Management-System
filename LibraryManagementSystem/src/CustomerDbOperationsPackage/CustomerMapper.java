package CustomerDbOperationsPackage;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int count) throws SQLException {
		
		Customer customer=new Customer(rs.getInt("id"),rs.getString("socialSecurityId") ,rs.getString("name"), rs.getString("surname"), rs.getInt("age"));
		return customer;
		
		
	}

}
