
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class TopPanel extends JPanel {
	UI ui;
	
	private ImageIcon addBookIcon;
	private MyButton addBookButton;
	
	private ImageIcon addCustomerIcon;
	private MyButton addCustomerButton;
	
	private MyButton assignBookButton;
	private ImageIcon assignBookIcon;
	
	
	
	private MyButton seePenaltiesButton;
	private ImageIcon seePenaltiesIcon;
	
	TopPanel(UI ui){
		this.ui=ui;
		this.setLayout(new GridLayout(1,4,15,5));
		this.setOpaque(false);
		this.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
		addBookIcon= new ImageIcon("./src/book.png");
		Image image = addBookIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		addBookIcon = new ImageIcon(newimg); 
		addBookButton= new MyButton("  Add New Book",addBookIcon,1,ui );
		addBookButton.setMargin(new Insets(15,15,15,15));
		addBookButton.setFocusPainted(false);
		
		addCustomerIcon=new ImageIcon("./src/add-user.png");
		image = addCustomerIcon.getImage(); // transform it 
		newimg = image.getScaledInstance(60, 60,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		addCustomerIcon = new ImageIcon(newimg);  // transform it back
		addCustomerButton= new MyButton("  Add New Customer",addCustomerIcon,2,ui );
		addCustomerButton.setMargin(new Insets(15,15,15,15));
		addCustomerButton.setFocusPainted(false);
		
		
		assignBookIcon= new ImageIcon("./src/assign-book.png");
		image=assignBookIcon.getImage();
		newimg=image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		assignBookIcon=new ImageIcon(newimg);
		assignBookButton=new MyButton("Assign Book", assignBookIcon, 3,ui);
		assignBookButton.setMargin(new Insets(15,15,15,15));
		assignBookButton.setFocusPainted(false);
		
		seePenaltiesIcon=new ImageIcon("./src/see-penalties.png");
		image=seePenaltiesIcon.getImage();
		newimg=image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
		seePenaltiesIcon=new ImageIcon(newimg);
		seePenaltiesButton=new MyButton("See Penalties", seePenaltiesIcon, 9,ui);
		seePenaltiesButton.setMargin(new Insets(15,15,15,15));
		seePenaltiesButton.setFocusPainted(false);		
		
		
		
		add(addBookButton);		
		add(addCustomerButton);	
		add(assignBookButton);
		add(seePenaltiesButton);
	}

}
