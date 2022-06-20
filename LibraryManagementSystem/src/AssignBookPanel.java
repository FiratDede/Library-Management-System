
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jdatepicker.JDatePicker;

import Tables.MyBookTable;
import Tables.MyCustomerTable;

public class AssignBookPanel extends JPanel {

	private UI ui;
	
	private JLabel assignBookTitle;
	
	private JLabel bookSearchTitle;
	
	private JTextField bookSearchTextField;
	private MyButton bookSearchButton;
	
	private MyBookTable bookTable;
	private JScrollPane scrollPaneForBookTable;
	
	private JLabel customerSearchTitle;
	
	private JTextField customerSearchTextField;
	private MyButton customerSearchButton;
	
	
	private MyCustomerTable customerTable;
	private JScrollPane scrollPaneForCustomerTable;
	
	private IssueDatePanel issueDatePanel;
	
	private DueDatePanel dueDatePanel;
	
	private AssignBookButtonPanel assignBookButtonPanel;
	
	public AssignBookPanel(UI ui) {

		this.ui=ui;
		this.setOpaque(false);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets=new Insets(5, 5, 5, 5);
		assignBookTitle=new JLabel("Assign Book To Customer");
		assignBookTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 30));
		this.add(assignBookTitle,c);
		
		
	      c.gridx=0;
	      c.gridy=1;
	      c.gridwidth=1;
	      c.insets=new Insets(8,5,5,5);
	      issueDatePanel=new IssueDatePanel();
	      add(issueDatePanel,c);
	      
	      c.gridx=1;
	      c.gridy=1;
	      c.gridwidth=1;
	      dueDatePanel=new DueDatePanel();
	      add(dueDatePanel,c);
		
		
		
		
		
		
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=1;
		c.insets=new Insets(5,5,5,5);
		bookSearchTitle=new JLabel("Enter book name:");
		bookSearchTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		this.add(bookSearchTitle,c);
		
		c.gridx=0;
		c.gridy=3;
		c.gridwidth=1;
		bookSearchTextField=new JTextField(30);
		this.add(bookSearchTextField,c);
		
		
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=1;
		bookSearchButton=new MyButton("Search", null, 4,ui);
		this.add(bookSearchButton,c);
		
		
		
		
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};
		
			bookTable = new MyBookTable();
		
	      
	 
	        //Create the scroll pane and add the table to it.
			scrollPaneForBookTable = new JScrollPane(bookTable);
	 
	        //Add the scroll pane to this panel.
	        c.gridx=0;
	        c.gridy=4;
	        c.gridwidth=2;
	        
	       add(scrollPaneForBookTable,c);
	       // Second Section
	       
	       customerSearchTitle=new JLabel("Enter customer name:");
	       
	       c.gridx=0;
	       c.gridy=5;
	       c.gridwidth=1;
	       customerSearchTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
	       add(customerSearchTitle,c);
	       
	       customerSearchTextField=new JTextField(30);
	       c.gridx=0;
	       c.gridy=6;
	       c.gridwidth=1;
	       add(customerSearchTextField,c);
	       
	      customerSearchButton=new MyButton("Search", null, 5,ui);
	      c.gridx=1;
	      c.gridy=6;
	      c.gridwidth=1;
	      add(customerSearchButton,c);
	      
	      
	      customerTable=new MyCustomerTable();
	     
	      scrollPaneForCustomerTable=new JScrollPane(customerTable);
	      
	      c.gridx=0;
	      c.gridy=7;
	      c.gridwidth=2;
	      add(scrollPaneForCustomerTable,c);
	 
	      //Last Section 
	      
	      
	
	      
	      c.gridx=0;
	      c.gridy=8;
	      c.gridwidth=2;
	      c.insets=new Insets(10, 10, 10, 10);
	      assignBookButtonPanel=new AssignBookButtonPanel(ui);
	      add(assignBookButtonPanel,c);
	      
	      
	   
	     
	}



	public JLabel getAssignBookTitle() {
		return assignBookTitle;
	}

	public void setAssignBookTitle(JLabel assignBookTitle) {
		this.assignBookTitle = assignBookTitle;
	}

	public JLabel getBookSearchTitle() {
		return bookSearchTitle;
	}

	public void setBookSearchTitle(JLabel bookSearchTitle) {
		this.bookSearchTitle = bookSearchTitle;
	}

	public JTextField getBookSearchTextField() {
		return bookSearchTextField;
	}

	public void setBookSearchTextField(JTextField bookSearchTextField) {
		this.bookSearchTextField = bookSearchTextField;
	}

	public MyButton getBookSearchButton() {
		return bookSearchButton;
	}

	public void setBookSearchButton(MyButton bookSearchButton) {
		this.bookSearchButton = bookSearchButton;
	}

	public MyBookTable getBookTable() {
		return bookTable;
	}

	public void setBookTable(MyBookTable bookTable) {
		this.bookTable = bookTable;
	}

	public JScrollPane getScrollPaneForBookTable() {
		return scrollPaneForBookTable;
	}

	public void setScrollPaneForBookTable(JScrollPane scrollPaneForBookTable) {
		this.scrollPaneForBookTable = scrollPaneForBookTable;
	}

	public JLabel getCustomerSearchTitle() {
		return customerSearchTitle;
	}

	public void setCustomerSearchTitle(JLabel customerSearchTitle) {
		this.customerSearchTitle = customerSearchTitle;
	}

	public JTextField getCustomerSearchTextField() {
		return customerSearchTextField;
	}

	public void setCustomerSearchTextField(JTextField customerSearchTextField) {
		this.customerSearchTextField = customerSearchTextField;
	}

	public MyButton getCustomerSearchButton() {
		return customerSearchButton;
	}

	public void setCustomerSearchButton(MyButton customerSearchButton) {
		this.customerSearchButton = customerSearchButton;
	}

	public MyCustomerTable getCustomerTable() {
		return customerTable;
	}

	public void setCustomerTable(MyCustomerTable customerTable) {
		this.customerTable = customerTable;
	}

	public JScrollPane getScrollPaneForCustomerTable() {
		return scrollPaneForCustomerTable;
	}

	public void setScrollPaneForCustomerTable(JScrollPane scrollPaneForCustomerTable) {
		this.scrollPaneForCustomerTable = scrollPaneForCustomerTable;
	}

	public IssueDatePanel getIssueDatePanel() {
		return issueDatePanel;
	}

	public void setIssueDatePanel(IssueDatePanel issueDatePanel) {
		this.issueDatePanel = issueDatePanel;
	}

	public DueDatePanel getDueDatePanel() {
		return dueDatePanel;
	}

	public void setDueDatePanel(DueDatePanel dueDatePanel) {
		this.dueDatePanel = dueDatePanel;
	}

	public AssignBookButtonPanel getAssignBookButtonPanel() {
		return assignBookButtonPanel;
	}

	public void setAssignBookButtonPanel(AssignBookButtonPanel assignBookButtonPanel) {
		this.assignBookButtonPanel = assignBookButtonPanel;
	}
	
	
	
}
