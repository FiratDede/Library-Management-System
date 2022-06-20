
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
public class ImagePanel extends JPanel {

    private BufferedImage image;

    public ImagePanel() {
       try {
          image = ImageIO.read(new File("./src/paper.jpg"));
       } catch (IOException ex) {
           
       }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       g.drawImage(image, 0, 0,this.getParent().getWidth(),this.getParent().getHeight(),this);       
    }


   

}