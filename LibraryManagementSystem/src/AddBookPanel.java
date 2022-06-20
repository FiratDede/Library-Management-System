
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddBookPanel extends JPanel {
	private UI ui;
	
	private JLabel addBookTitle;
	
	private JLabel bookNameLabel;
	private JTextField bookNameTextField;
	
	private JLabel bookAuthorLabel;
	private JTextField bookAuthorTextField;
	
	private JLabel bookAmountLabel;
	private JTextField bookAmountTextfield;
	
	private JLabel totalNumberOfPageLabel;
	private JTextField totalNumberOfPageTextField;
	
	private MyButton addBookButton;
	
	private InfoPanel infoPanel;
	
	AddBookPanel(UI ui){
		
		this.ui=ui;
		this.setOpaque(false);
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		addBookTitle=new JLabel("Add New Book");
		addBookTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 30));
		
		bookNameLabel=new JLabel("Book Name:");
		bookNameLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		bookNameTextField=new JTextField(15);
		
		bookAuthorLabel=new JLabel("Author:");
	    bookAuthorLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
	    bookAuthorTextField=new JTextField(15);
	    
	    bookAmountLabel=new JLabel("Amount:");
	    bookAmountLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
	    bookAmountTextfield=new JTextField(15);
	    
	    totalNumberOfPageLabel=new JLabel("Total Number of Page:");
	    totalNumberOfPageLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
	    totalNumberOfPageTextField=new JTextField(15);
		
	    addBookButton=new MyButton("Add New Book", null, 7,ui);
	    
	    infoPanel= new InfoPanel();
	    
	    c.fill=c.BOTH;
	    
	    c.gridx=0;
		c.gridy=0;
		c.gridwidth=2;
		c.insets=new Insets(10, 10, 10, 10);
		this.add(addBookTitle,c);
		
		c.gridwidth=1;
		c.gridx=0;
		c.gridy=1;
		this.add(bookNameLabel,c);
		
		c.gridwidth=1;
		c.gridx=1;
		c.gridy=1;
		this.add(bookNameTextField,c);
		
		c.gridwidth=1;
		c.gridx=0;
		c.gridy=2;
		this.add(bookAuthorLabel,c);
		
		c.gridx=1;
		c.gridy=2;
		this.add(bookAuthorTextField,c);
		
		c.gridx=0;
		c.gridy=3;
		this.add(bookAmountLabel,c);
		
		c.gridx=1;
		c.gridy=3;
		this.add(bookAmountTextfield,c);
		
		c.gridx=0;
		c.gridy=4;
		this.add(totalNumberOfPageLabel,c);
		
		c.gridx=1;
		c.gridy=4;
		this.add(totalNumberOfPageTextField,c);
		
		c.gridx=1;
		c.gridy=5;
		this.add(addBookButton,c);
		
		c.gridx=0;
		c.gridy=6;
		c.gridwidth=2;
		this.add(infoPanel,c);
		
		
	}

	

	public JLabel getAddBookTitle() {
		return addBookTitle;
	}

	public void setAddBookTitle(JLabel addBookTitle) {
		this.addBookTitle = addBookTitle;
	}

	public JLabel getBookNameLabel() {
		return bookNameLabel;
	}

	public void setBookNameLabel(JLabel bookNameLabel) {
		this.bookNameLabel = bookNameLabel;
	}

	public JTextField getBookNameTextField() {
		return bookNameTextField;
	}

	public void setBookNameTextField(JTextField bookNameTextField) {
		this.bookNameTextField = bookNameTextField;
	}

	public JLabel getBookAuthorLabel() {
		return bookAuthorLabel;
	}

	public void setBookAuthorLabel(JLabel bookAuthorLabel) {
		this.bookAuthorLabel = bookAuthorLabel;
	}

	public JTextField getBookAuthorTextField() {
		return bookAuthorTextField;
	}

	public void setBookAuthorTextField(JTextField bookAuthorTextField) {
		this.bookAuthorTextField = bookAuthorTextField;
	}

	public JLabel getBookAmountLabel() {
		return bookAmountLabel;
	}

	public void setBookAmountLabel(JLabel bookAmountLabel) {
		this.bookAmountLabel = bookAmountLabel;
	}

	public JTextField getBookAmountTextfield() {
		return bookAmountTextfield;
	}

	public void setBookAmountTextfield(JTextField bookAmountTextfield) {
		this.bookAmountTextfield = bookAmountTextfield;
	}

	public JLabel getTotalNumberOfPageLabel() {
		return totalNumberOfPageLabel;
	}

	public void setTotalNumberOfPageLabel(JLabel totalNumberOfPageLabel) {
		this.totalNumberOfPageLabel = totalNumberOfPageLabel;
	}

	public JTextField getTotalNumberOfPageTextField() {
		return totalNumberOfPageTextField;
	}

	public void setTotalNumberOfPageTextField(JTextField totalNumberOfPageTextField) {
		this.totalNumberOfPageTextField = totalNumberOfPageTextField;
	}

	public MyButton getAddBookButton() {
		return addBookButton;
	}

	public void setAddBookButton(MyButton addBookButton) {
		this.addBookButton = addBookButton;
	}

	public InfoPanel getInfoPanel() {
		return infoPanel;
	}

	public void setInfoPanel(InfoPanel infoPanel) {
		this.infoPanel = infoPanel;
	}
	

}
