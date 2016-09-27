import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class MyJFrame extends JFrame{
	private static final long serialVersionUID = -2538588558556565687L;

	public MyJFrame(){
		super("QQ1.0");
		ImageIcon dlGUI=new ImageIcon("src/Icons/dl.png");    //要显示的  背景图层
		this.setBounds(300, 130, dlGUI.getIconWidth()+16, dlGUI.getIconHeight()+34);//setLocation()+setSize()
		this.setBackground(Color.gray);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Image myImage=Toolkit.getDefaultToolkit().getImage("src/Icons/qq.png");//**更换成qq小图标
		this.setIconImage(myImage);
	     //????
		Container con=getContentPane();

		ImagePanel backPicturePanel=new ImagePanel(dlGUI);//new一个图层面板对象，背景图片backPicturePanel
		con.add(backPicturePanel,BorderLayout.CENTER);//把图片图层，放到Frame中间
		
		final TextField account=new TextField("",20);     //account,password账号、密码 输入区
		final JPasswordField password=new JPasswordField("",20);
        JPanel kuang=new JPanel(new GridLayout(2, 1));
        kuang.add(account);
        kuang.add(password);
		backPicturePanel.add(kuang);
      

		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
       new MyJFrame();
	}

}
