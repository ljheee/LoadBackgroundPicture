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
	public MyJFrame(){
		super("QQ1.0");
		ImageIcon dlGUI=new ImageIcon("src/Icons/dl.png");    //Ҫ��ʾ��  ����ͼ��
		this.setBounds(300, 130, dlGUI.getIconWidth()+16, dlGUI.getIconHeight()+34);//setLocation()+setSize()
		this.setBackground(Color.gray);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Image myImage=Toolkit.getDefaultToolkit().getImage("src/Icons/qq.png");//**������qqСͼ��
		this.setIconImage(myImage);
	     //????
		Container con=getContentPane();

		ImagePanel backPicturePanel=new ImagePanel(dlGUI);//newһ��ͼ�������󣬱���ͼƬbackPicturePanel
		con.add(backPicturePanel,BorderLayout.CENTER);//��ͼƬͼ�㣬�ŵ�Frame�м�
		
		final TextField account=new TextField("",20);     //account,password�˺š����� ������
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
