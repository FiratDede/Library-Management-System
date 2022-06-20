
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Tables.SeePenaltiesTable;

public class SeePenaltiesPanel extends JPanel {

	private UI ui;
	private JLabel seePenaltiesTitle;
	
	private SeePenaltiesTable seePenaltiesTable ;
	private JScrollPane scrollPaneForSeePenaltiesTable;

	public SeePenaltiesPanel(UI ui) {
		super();
		this.ui=ui;
		this.setOpaque(false);
		
		
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		c.fill=c.BOTH;
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=1;
		c.insets=new Insets(10, 10, 10, 10);
		seePenaltiesTitle=new JLabel("All Penalties");
		seePenaltiesTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 30));
		add(seePenaltiesTitle,c);
		
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=1;
		
		seePenaltiesTable=new SeePenaltiesTable();
		scrollPaneForSeePenaltiesTable=new JScrollPane(seePenaltiesTable);
		add(scrollPaneForSeePenaltiesTable,c);

	
	}



	public JLabel getSeePenaltiesTitle() {
		return seePenaltiesTitle;
	}

	public void setSeePenaltiesTitle(JLabel seePenaltiesTitle) {
		this.seePenaltiesTitle = seePenaltiesTitle;
	}

	public SeePenaltiesTable getSeePenaltiesTable() {
		return seePenaltiesTable;
	}

	public void setSeePenaltiesTable(SeePenaltiesTable seePenaltiesTable) {
		this.seePenaltiesTable = seePenaltiesTable;
	}

	public JScrollPane getScrollPaneForSeePenaltiesTable() {
		return scrollPaneForSeePenaltiesTable;
	}

	public void setScrollPaneForSeePenaltiesTable(JScrollPane scrollPaneForSeePenaltiesTable) {
		this.scrollPaneForSeePenaltiesTable = scrollPaneForSeePenaltiesTable;
	}
	

}
