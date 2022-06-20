package Tables;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import CustomerDbOperationsPackage.Customer;

public class MyCustomerTable extends JTable {
	private DefaultTableModel model;
	public MyCustomerTable() {
		
		model=new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		model.addColumn("ID");
	    model.addColumn("Social Security ID");
	    model.addColumn("Name");
	    model.addColumn("Surname");
	    model.addColumn("Age");
	    
	    this.setModel(model);
	    this.setPreferredScrollableViewportSize(new Dimension(650, 70));
		this.setFillsViewportHeight(true);
		
		this.getColumnModel().getColumn(0).setPreferredWidth(50);
		
		this.getColumnModel().getColumn(4).setPreferredWidth(10);
		
		
		
	     this.doLayout();
		
	}
	
	
	public void addCustomersToTable(List<Customer> customers) {
		for(int i=0; i<customers.size(); ++i) {
			 ((DefaultTableModel) this.getModel()).addRow(customers.get(i).toStringArray());
		}
		
		
	}
	public void deleteAllRows() {
		this.model.setRowCount(0);
	}
	

	


	
 
	
	
	

}
