import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**ͼ�����
 * ��ImagePanel��������ӱ���ͼƬ
 * @author Administrator
 *
 */
public class ImagePanel extends JPanel{
	private static final long serialVersionUID = 6321014597618390503L;
	
	private Image image;
	public ImagePanel (ImageIcon imageIcon){
	image=imageIcon.getImage();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(image,0,0,this);
	}


}
