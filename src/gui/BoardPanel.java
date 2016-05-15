import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		ImageIcon icon = new ImageIcon("../monopolyboard.jpg");
		Image img = icon.getImage();
		g.drawImage(img, 0, 0, this);
		
		g.setColor(Color.BLACK);
		g.fillOval(439, 479, 17, 17);
		
		g.setColor(Color.ORANGE);
		g.fillOval(440, 480, 15, 15);
		
		g.setColor(Color.BLACK);
		g.fillOval(459, 479, 17, 17);
		
		g.setColor(Color.RED);
		g.fillOval(460, 480, 15, 15);
		
		g.setColor(Color.BLACK);
		g.fillOval(479, 479, 17, 17);
		
		g.setColor(Color.CYAN);
		g.fillOval(480, 480, 15, 15);
	}
}