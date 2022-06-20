import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BookDbOperationsPackage.Book;
import BookDbOperationsPackage.BookJDBCTemplate;
import BorrowedBookDbOperationsPackage.BorrowedBookJDBCTemplate;
import BorrowedBookDbOperationsPackage.DetailedBorrowedBookInfo;
import CustomerDbOperationsPackage.Customer;
import CustomerDbOperationsPackage.CustomerJDBCTemplate;
import Tables.MyBookTable;
import Tables.MyCustomerTable;
import Tables.SeePenaltiesTable;

public class MyButton extends JButton  {
	int id;
	UI ui;
	
	MyButton(String title,Icon icon,int id,UI ui){
		super(title, icon);
		this.id=id;
		this.ui=ui;
		this.setFocusable(false);
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				
				if(id==1) // for add book panel 
				{
					ui.clearBottomSection();
					ui.getImagePanel().setPreferredSize(new Dimension(500, 400));
					ui.setCurrentPanel(ui.getAddBookPanel());
					ui.getImagePanel().add(ui.getCurrentPanel());
					ui.getMiddlePanel().add(ui.getImagePanel());
					ui.getBackgroundImagePanel().add(ui.getMiddlePanel());
					ui.pack();
					ui.repaint();
					
					
				}
				else if(id==2)  // for add customer book panel
				{	
					ui.clearBottomSection();
					ui.getImagePanel().setPreferredSize(new Dimension(500, 400));
					ui.setCurrentPanel(ui.getAddCustomerPanel());
					ui.getImagePanel().add(ui.getCurrentPanel());
					ui.getMiddlePanel().add(ui.getImagePanel());
					ui.getBackgroundImagePanel().add(ui.getMiddlePanel());
					ui.pack();
					ui.repaint();

				}
				else if(id==3) // for assign book button
				{
					ui.clearBottomSection();
					ui.getImagePanel().setPreferredSize(new Dimension(800, 530));
					ui.setCurrentPanel(ui.getAssignBookPanel());
					ui.getImagePanel().add(ui.getCurrentPanel());
					ui.getMiddlePanel().add(ui.getImagePanel());
					ui.getBackgroundImagePanel().add(ui.getMiddlePanel());
					
					ui.pack();
					ui.repaint();
				
					//ui.setVisible(true);
				}
				else if(id==4) //book search button  in AssignBookPanel
				{	
					ui.getAssignBookPanel().getBookTable().deleteAllRows();
					List<Book> books=ui.getBookJDBCTemplate().findBooksByName(ui.getAssignBookPanel().getBookSearchTextField().getText());	   
					ui.getAssignBookPanel().getBookTable().addBooksToTable(books);	
				}
				else if(id==5) { //customer search button in AssignBookPanel
					ui.getAssignBookPanel().getCustomerTable().deleteAllRows();
					List<Customer> customers=ui.getCustomerJDBCTemplate().findCustomersByName(ui.getAssignBookPanel().getCustomerSearchTextField().getText());	   
					ui.getAssignBookPanel().getCustomerTable().addCustomersToTable(customers);	
					
				}
				else if(id==6) { // assignBookButton icin bu kisim
										
					BorrowedBookJDBCTemplate  borrowedBookJDBCTemplate= ui.getBorrowedBookJDBCTemplate();
					BookJDBCTemplate bookJDBCTemplate=ui.getBookJDBCTemplate();
					
					MyBookTable bookTable= ui.getAssignBookPanel().getBookTable();
					
					int bookId=  Integer.parseInt( (String) (bookTable.getValueAt( bookTable.getSelectedRow(), 0)));
					int bookAmount= Integer.parseInt(  (String) (bookTable.getValueAt(bookTable.getSelectedRow(), 3)));
					
					MyCustomerTable customerTable= ui.getAssignBookPanel().getCustomerTable();
					int customerId= Integer.parseInt((String) (customerTable.getValueAt(customerTable.getSelectedRow(), 0)));
					
					Calendar calendarForIssueDate= (Calendar) ui.getAssignBookPanel().getIssueDatePanel().getIssueDatePicker().getModel().getValue();
					Date issueDate= new Date(calendarForIssueDate.getTimeInMillis());				
					
					Calendar calendarForDueDate= (Calendar) ui.getAssignBookPanel().getDueDatePanel().getDueDatePicker().getModel().getValue();
					Date dueDate=new Date(calendarForDueDate.getTimeInMillis()); 
					if(bookAmount>0) {
						borrowedBookJDBCTemplate.addBorrowedBook(bookId, customerId, issueDate, dueDate);
						bookJDBCTemplate.setAmount(bookId, bookAmount-1);
						
						bookTable.getModel().setValueAt(String.valueOf(bookAmount-1), bookTable.getSelectedRow(),3);
						
					}
					
				}
				else if(id==7) { // for addBookButton in AddBookPanel 
					BookJDBCTemplate bookJDBCTemplate=ui.getBookJDBCTemplate();
					AddBookPanel addBookPanel=ui.getAddBookPanel();
					
					String bookName= addBookPanel.getBookNameTextField().getText();
					String author=addBookPanel.getBookAuthorTextField().getText();
					String amount=addBookPanel.getBookAmountTextfield().getText();
					String totalPages=addBookPanel.getTotalNumberOfPageTextField().getText();
					int amountInt,totalPagesInt;
					
					JLabel info=addBookPanel.getInfoPanel().getInfo();
					try {
						amountInt=Integer.parseInt(amount);
						totalPagesInt=Integer.parseInt(totalPages);
						
						
						bookJDBCTemplate.addNewBook(bookName, author, amountInt, totalPagesInt);
						
						info.setForeground(Color.green.darker());
						info.setText("Success! New Book Added!");
						
					}
					catch(Exception exception) {
					
						info.setForeground(Color.red);
						info.setText("Error! New Book Can't Added");
						
					}
					
					
					
				}
				else if(id==8) {  // for add customer button
					CustomerJDBCTemplate customerJDBCTemplate=ui.getCustomerJDBCTemplate();
					
					AddCustomerPanel addCustomerPanel=ui.getAddCustomerPanel();
					
					String socialSecurityId= addCustomerPanel.getSocialSecurityIdTextField().getText();
					String firstName=addCustomerPanel.getFirstnameTextField().getText();
					String surname= addCustomerPanel.getSurnameTextField().getText();
					String age=addCustomerPanel.getAgeTextField().getText();
					
					JLabel info=addCustomerPanel.getInfoPanel().getInfo();
					
					int ageInt;
					try {
						ageInt= Integer.parseInt(age);
						customerJDBCTemplate.addNewCustomer(socialSecurityId, firstName, surname, ageInt);
						info.setForeground(Color.green.darker());
						info.setText("Success! New Customer Added!");
					}
					catch(Exception exception) {
			
						info.setForeground(Color.red);
						info.setText("Error! New Customer Can't Added");
					}
				}
				else if(id==9) { // For see penalties button
					ui.clearBottomSection();
					ui.getImagePanel().setPreferredSize(new Dimension(1200, 400));
					ui.setCurrentPanel(ui.getSeePenaltiesPanel());
					ui.getImagePanel().add(ui.getCurrentPanel());
					ui.getMiddlePanel().add(ui.getImagePanel());
					ui.getBackgroundImagePanel().add(ui.getMiddlePanel());
					
					BorrowedBookJDBCTemplate borrowedBookJDBCTemplate=ui.getBorrowedBookJDBCTemplate();
					List<DetailedBorrowedBookInfo> all_info=borrowedBookJDBCTemplate.getPenalizedCustomersInfo();
					SeePenaltiesTable seePenaltiesTable= ui.getSeePenaltiesPanel().getSeePenaltiesTable();
					seePenaltiesTable.deleteAllRows();
					seePenaltiesTable.addDetailedBorrowedBookInfoToTable(all_info);
					
					ui.pack();
					ui.repaint();
					
				}
			}
		});
	}

	
	

}
