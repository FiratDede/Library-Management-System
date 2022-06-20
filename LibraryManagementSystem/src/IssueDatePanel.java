
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdatepicker.JDatePicker;

public class IssueDatePanel extends JPanel {
	
	
	private JLabel issueDateTitle;
	private JDatePicker issueDatePicker; 

	public IssueDatePanel() {
		
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		
		issueDateTitle=new JLabel("Select Issue Date:  ");
		issueDateTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
	    add(issueDateTitle);
	   
	    issueDatePicker=new JDatePicker();
	    add(issueDatePicker);
	    
	    
	}

	

	public JLabel getIssueDateTitle() {
		return issueDateTitle;
	}

	public void setIssueDateTitle(JLabel issueDateTitle) {
		this.issueDateTitle = issueDateTitle;
	}

	public JDatePicker getIssueDatePicker() {
		return issueDatePicker;
	}

	public void setIssueDatePicker(JDatePicker issueDatePicker) {
		this.issueDatePicker = issueDatePicker;
	}
	

}
