package Tables;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import BookDbOperationsPackage.Book;

public class MyBookTable extends JTable {
	private DefaultTableModel model;
	public MyBookTable() {
		
		model=new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		model.addColumn("ID");
	    model.addColumn("Name");
	    model.addColumn("Author");
	    model.addColumn("Amount");
	    model.addColumn("Total Pages");
	 
	    
	    this.setModel(model);
	    this.setPreferredScrollableViewportSize(new Dimension(650, 70));
		this.setFillsViewportHeight(true);
		
		
		
		this.getColumnModel().getColumn(0).setPreferredWidth(50);
		this.getColumnModel().getColumn(3).setPreferredWidth(20);
		this.getColumnModel().getColumn(4).setPreferredWidth(20);
		
		
		
		
	     this.doLayout();
		
	}
	
	
	public void addBooksToTable(List<Book> books) {
		for(int i=0; i<books.size(); ++i) {
			 ((DefaultTableModel) this.getModel()).addRow(books.get(i).toStringArray());
		}
		
		
	}
	public void deleteAllRows() {
		this.model.setRowCount(0);
	}
	

	


	
 
	
	
	

}
