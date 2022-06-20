
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class AssignBookButtonPanel extends JPanel {
	private UI ui;
	
	MyButton assignBookButton;
	public AssignBookButtonPanel(UI ui) {

		this.ui=ui;
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
		
		assignBookButton=new MyButton("Assign Selected Book to Selected Customer",null, 6,ui);
		this.add(assignBookButton);
	}
	

}
