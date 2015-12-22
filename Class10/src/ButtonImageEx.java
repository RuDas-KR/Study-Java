import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ButtonImageEx extends JFrame
{
	Container contentPane;
	
	ButtonImageEx()
	{
		setTitle("��ư�� ������ �ޱ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new
		ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new
		ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new
		ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ButtonImageEx();
	}
}