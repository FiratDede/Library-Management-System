import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;



import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import BookDbOperationsPackage.BookJDBCTemplate;
import BorrowedBookDbOperationsPackage.BorrowedBookJDBCTemplate;
import CustomerDbOperationsPackage.CustomerJDBCTemplate;

public class UI extends JFrame{
	private CustomerJDBCTemplate customerJDBCTemplate;
	
	private BookJDBCTemplate bookJDBCTemplate;
	
	private BorrowedBookJDBCTemplate borrowedBookJDBCTemplate;
	
	private  BackgroundImagePanel backgroundImagePanel;
	
	private JPanel currentPanel;
	private TopPanel topPanel;

	
	private ImagePanel imagePanel;
	
	private JPanel middlePanel;
	
	private AddBookPanel addBookPanel;
	
	private AddCustomerPanel addCustomerPanel;
	
	private AssignBookPanel assignBookPanel;
	
	private SeePenaltiesPanel seePenaltiesPanel;
	

	
	UI(CustomerJDBCTemplate customerJDBCTemplate, BookJDBCTemplate bookJDBCTemplate, BorrowedBookJDBCTemplate borrowedBookJDBCTemplate){
		this.customerJDBCTemplate= customerJDBCTemplate;
		this.bookJDBCTemplate=bookJDBCTemplate;
		this.borrowedBookJDBCTemplate=borrowedBookJDBCTemplate;
		backgroundImagePanel= new BackgroundImagePanel(new ImageIcon("./src/libraryBackground.jpg").getImage());
		backgroundImagePanel.setOpaque(false);
		this.getContentPane().add(backgroundImagePanel);

		
		
		
		topPanel=new TopPanel(this);
		middlePanel=new JPanel(new GridBagLayout());
		middlePanel.setOpaque(false);
		addBookPanel=new AddBookPanel(this);
		addCustomerPanel=new AddCustomerPanel(this);
		assignBookPanel=new AssignBookPanel(this);
		seePenaltiesPanel=new SeePenaltiesPanel(this);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Library Management System");
		

		
		
		backgroundImagePanel.add(topPanel,BorderLayout.NORTH);
		

	
		imagePanel= new ImagePanel();
		imagePanel.setLayout(new GridBagLayout());
		imagePanel.setPreferredSize(new Dimension(500, 400));
		
		backgroundImagePanel.add(Box.createRigidArea(new Dimension(100, 50)),BorderLayout.WEST);
		backgroundImagePanel.add(Box.createRigidArea(new Dimension(100, 50)),BorderLayout.EAST);
		backgroundImagePanel.add(Box.createRigidArea(new Dimension(100, 50)),BorderLayout.SOUTH);

		
	}
	public void run() {
		this.pack();		
		this.setVisible(true);
	}
	public void clearBottomSection() {
		if(currentPanel!=null)
		imagePanel.remove(this.currentPanel);
		middlePanel.remove(imagePanel);
	}


	public CustomerJDBCTemplate getCustomerJDBCTemplate() {
		return customerJDBCTemplate;
	}



	public void setCustomerJDBCTemplate(CustomerJDBCTemplate customerJDBCTemplate) {
		this.customerJDBCTemplate = customerJDBCTemplate;
	}



	public BackgroundImagePanel getBackgroundImagePanel() {
		return backgroundImagePanel;
	}



	public void setBackgroundImagePanel(BackgroundImagePanel backgroundImagePanel) {
		this.backgroundImagePanel = backgroundImagePanel;
	}



	public TopPanel getTopPanel() {
		return topPanel;
	}



	public void setTopPanel(TopPanel topPanel) {
		this.topPanel = topPanel;
	}



	public JPanel getMiddlePanel() {
		return middlePanel;
	}



	public void setMiddlePanel(JPanel middlePanel) {
		this.middlePanel = middlePanel;
	}



	public AddCustomerPanel getAddCustomerPanel() {
		return addCustomerPanel;
	}



	public void setAddCustomerPanel(AddCustomerPanel addCustomerPanel) {
		this.addCustomerPanel = addCustomerPanel;
	}



	public ImagePanel getImagePanel() {
		return imagePanel;
	}



	public void setImagePanel(ImagePanel imagePanel) {
		this.imagePanel = imagePanel;
	}
	public AssignBookPanel getAssignBookPanel() {
		return assignBookPanel;
	}
	public void setAssignBookPanel(AssignBookPanel assignBookPanel) {
		this.assignBookPanel = assignBookPanel;
	}
	public JPanel getCurrentPanel() {
		return currentPanel;
	}
	public void setCurrentPanel(JPanel currentPanel) {
		this.currentPanel = currentPanel;
	}
	public AddBookPanel getAddBookPanel() {
		return addBookPanel;
	}
	public void setAddBookPanel(AddBookPanel addBookPanel) {
		this.addBookPanel = addBookPanel;
	}
	public BookJDBCTemplate getBookJDBCTemplate() {
		return bookJDBCTemplate;
	}
	public void setBookJDBCTemplate(BookJDBCTemplate bookJDBCTemplate) {
		this.bookJDBCTemplate = bookJDBCTemplate;
	}
	public BorrowedBookJDBCTemplate getBorrowedBookJDBCTemplate() {
		return borrowedBookJDBCTemplate;
	}
	public void setBorrowedBookJDBCTemplate(BorrowedBookJDBCTemplate borrowedBookJDBCTemplate) {
		this.borrowedBookJDBCTemplate = borrowedBookJDBCTemplate;
	}
	public SeePenaltiesPanel getSeePenaltiesPanel() {
		return seePenaltiesPanel;
	}
	public void setSeePenaltiesPanel(SeePenaltiesPanel seePenaltiesPanel) {
		this.seePenaltiesPanel = seePenaltiesPanel;
	}
	
	
	
	

	
	
}
