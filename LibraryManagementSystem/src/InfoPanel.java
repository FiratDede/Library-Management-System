
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
	private JLabel info;
	public InfoPanel() {
		this.setOpaque(false);
		
		info=new JLabel("");
		info.setFont(new Font(Font.SANS_SERIF,Font.BOLD, 17));
		add(info);
		
	}
	public JLabel getInfo() {
		return info;
	}
	public void setInfo(JLabel info) {
		this.info = info;
	}
	
}
