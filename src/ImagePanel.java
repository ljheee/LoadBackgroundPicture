import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**图层面板
 * 类ImagePanel，用于添加背景图片
 * @author Administrator
 *
 */
public class ImagePanel extends JPanel{
	private Image image;
	public ImagePanel (ImageIcon imageIcon){
	image=imageIcon.getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(image,0,0,this);
	}


}
