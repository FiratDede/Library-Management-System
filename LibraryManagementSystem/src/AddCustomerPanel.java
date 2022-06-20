
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddCustomerPanel extends JPanel {
	
	private UI ui;
	
	private JLabel addCustomerTitle;
	
	private JLabel socialSecurityIdLabel;
	private JTextField socialSecurityIdTextField;
	
	private JLabel firstnameLabel;
	private JTextField firstnameTextField;
	
	private JLabel surnameLabel;
	private JTextField surnameTextField;
	
	private JLabel ageLabel;
	private JTextField ageTextField;
	
	private MyButton addCustomerButton;
	
	private InfoPanel infoPanel;
	
	public AddCustomerPanel(UI ui) {

		this.setOpaque(false);
		this.ui=ui;
		
	
		this.setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
		
		addCustomerTitle= new JLabel("Add New Customer");
		addCustomerTitle.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 30));
		
		
		socialSecurityIdLabel=new JLabel("Social Security Id:");
		socialSecurityIdLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		socialSecurityIdTextField=new JTextField(15);
		
		firstnameLabel=new JLabel("Firstname:");
		firstnameLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		firstnameTextField=new JTextField(15);
		
		surnameLabel=new JLabel("Surname:");
		surnameLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		surnameTextField=new JTextField(15);
		
		ageLabel=new JLabel("Age:");
		ageLabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN, 17));
		ageTextField=new JTextField(15);
		
		addCustomerButton=new MyButton("Add New Customer",null,8,ui);
		
		infoPanel=new InfoPanel();
		
		c.fill=c.BOTH;
		c.weightx=0.3;
		
		c.gridx=0;
		c.gridy=0;
		c.gridwidth=2;
		c.insets=new Insets(10, 10, 10, 10);
		this.add(addCustomerTitle,c);
		
		
		c.gridwidth=1;
		c.gridx=0;
		c.gridy=1;
		this.add(socialSecurityIdLabel,c);
		
		c.gridwidth=1;
		c.gridx=1;
		c.gridy=1;
		this.add(socialSecurityIdTextField,c);
		
		
		
		c.gridwidth=1;
		c.gridx=0;
		c.gridy=2;
		this.add(firstnameLabel,c);
		c.gridx=1;
		c.gridy=2;
		this.add(firstnameTextField,c);
		c.gridx=0;
		c.gridy=3;
		this.add(surnameLabel,c);
		c.gridx=1;
		c.gridy=3;
		this.add(surnameTextField,c);
		c.gridx=0;
		c.gridy=4;
		
		this.add(ageLabel,c);
		c.gridx=1;
		c.gridy=4;
		this.add(ageTextField,c);
		
		c.gridx=1;
		c.gridy=5;
		this.add(addCustomerButton,c);
	
		c.gridx=0;
		c.gridy=6;
		c.gridwidth=2;
		this.add(infoPanel,c);
		
	}
	
	public JLabel getAddCustomerTitle() {
		return addCustomerTitle;
	}
	public void setAddCustomerTitle(JLabel addCustomerTitle) {
		this.addCustomerTitle = addCustomerTitle;
	}
	public JLabel getSocialSecurityIdLabel() {
		return socialSecurityIdLabel;
	}
	public void setSocialSecurityIdLabel(JLabel socialSecurityIdLabel) {
		this.socialSecurityIdLabel = socialSecurityIdLabel;
	}
	public JTextField getSocialSecurityIdTextField() {
		return socialSecurityIdTextField;
	}
	public void setSocialSecurityIdTextField(JTextField socialSecurityIdTextField) {
		this.socialSecurityIdTextField = socialSecurityIdTextField;
	}
	public JLabel getFirstnameLabel() {
		return firstnameLabel;
	}
	public void setFirstnameLabel(JLabel firstnameLabel) {
		this.firstnameLabel = firstnameLabel;
	}
	public JTextField getFirstnameTextField() {
		return firstnameTextField;
	}
	public void setFirstnameTextField(JTextField firstnameTextField) {
		this.firstnameTextField = firstnameTextField;
	}
	public JLabel getSurnameLabel() {
		return surnameLabel;
	}
	public void setSurnameLabel(JLabel surnameLabel) {
		this.surnameLabel = surnameLabel;
	}
	public JTextField getSurnameTextField() {
		return surnameTextField;
	}
	public void setSurnameTextField(JTextField surnameTextField) {
		this.surnameTextField = surnameTextField;
	}
	public JLabel getAgeLabel() {
		return ageLabel;
	}
	public void setAgeLabel(JLabel ageLabel) {
		this.ageLabel = ageLabel;
	}
	public JTextField getAgeTextField() {
		return ageTextField;
	}
	public void setAgeTextField(JTextField ageTextField) {
		this.ageTextField = ageTextField;
	}
	public MyButton getAddCustomerButton() {
		return addCustomerButton;
	}
	public void setAddCustomerButton(MyButton addCustomerButton) {
		this.addCustomerButton = addCustomerButton;
	}
	public InfoPanel getInfoPanel() {
		return infoPanel;
	}
	public void setInfoPanel(InfoPanel infoPanel) {
		this.infoPanel = infoPanel;
	}
	
	

}
