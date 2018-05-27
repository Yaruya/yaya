package zuoye;

import java.awt.*;

import javax.swing.*;

public class zujian extends JFrame{

	private JTextField text;
	private JPasswordField jpass;
	
	public zujian(){
		
		super("登录");
		
		JLabel lab1 = new JLabel("账户：");
		JLabel lab2 = new JLabel("密码：");
		
		JButton button1 = new JButton("确定");
		JButton button2 = new JButton("取消");
		
		text = new JTextField(10);
		jpass = new JPasswordField(10);
		
		JPanel p = new JPanel();
		p.add(button1);
		p.add(button2);
		
		JPanel p1 = new JPanel();
		p1.add(lab1);
		p1.add(text);
		
		JPanel p2 = new JPanel();
		p2.add(lab2);
		p2.add(jpass);
		
		Container con = this.getContentPane();
		con.add(p1);
		con.add(p2);
		con.add(p);
		con.setLayout(new FlowLayout());
		
		setSize(280,252);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new zujian();

	}

}
