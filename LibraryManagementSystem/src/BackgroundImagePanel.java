
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundImagePanel extends JPanel {
	private Image img;
	double aspectRatio;

	  public BackgroundImagePanel(Image img) 
	  {
	    this.img=img;
	    this.aspectRatio= (double) img.getWidth(null)/img.getHeight(null);
	    this.setLayout(new BorderLayout());
	  }
	  @Override
	  public void paintComponent(Graphics g) {
		  this.setOpaque(false);
		   g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
		  }
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	  


}
