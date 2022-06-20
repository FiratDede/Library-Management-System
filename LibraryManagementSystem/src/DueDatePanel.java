
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.jdatepicker.JDatePicker;

public class DueDatePanel extends JPanel {
	JLabel dueDateTitle;
	JDatePicker dueDatePicker;
	
	public DueDatePanel() {
		
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		
		dueDateTitle=new JLabel("Select Due Date: ");
		dueDateTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		this.add(dueDateTitle);
		
		dueDatePicker=new JDatePicker();

		
		this.add(dueDatePicker);
	}
	public JLabel getDueDateTitle() {
		return dueDateTitle;
	}
	public void setDueDateTitle(JLabel dueDateTitle) {
		this.dueDateTitle = dueDateTitle;
	}
	public JDatePicker getDueDatePicker() {
		return dueDatePicker;
	}
	public void setDueDatePicker(JDatePicker dueDatePicker) {
		this.dueDatePicker = dueDatePicker;
	}

}
