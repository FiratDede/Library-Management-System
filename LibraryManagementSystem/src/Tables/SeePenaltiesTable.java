package Tables;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BorrowedBookDbOperationsPackage.DetailedBorrowedBookInfo;

public class SeePenaltiesTable extends JTable{
	private DefaultTableModel model;

	public SeePenaltiesTable() {
		super();
		
		model=new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		model.addColumn("Id");
		model.addColumn("Social Security Id");
		model.addColumn("Customer Name");
		model.addColumn("Customer Surname");
		model.addColumn("Book Name");
		model.addColumn("Book Author");
		model.addColumn("Issue Date");
		model.addColumn("Due Date");
		model.addColumn("DelayedDayCount");
		
		 this.setModel(model);
		 this.setPreferredScrollableViewportSize(new Dimension(1100, 150));
		 this.setFillsViewportHeight(true);
		 
		this.getColumnModel().getColumn(6).setPreferredWidth(40);
			
		this.getColumnModel().getColumn(7).setPreferredWidth(40);
	
		 this.doLayout();
	}
	
	public void addDetailedBorrowedBookInfoToTable(List<DetailedBorrowedBookInfo> all_info) {
		for(int i=0; i<all_info.size(); ++i) {
			 ((DefaultTableModel) this.getModel()).addRow(all_info.get(i).toStringArray());
		}
	}
	public void deleteAllRows() {
		this.model.setRowCount(0);
	}
}
