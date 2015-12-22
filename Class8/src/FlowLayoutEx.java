import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutEx extends JFrame
{
	FlowLayoutEx()
	{
		setTitle("FlowLayout Sample");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(300, 250);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Caculate"));
	}
	public static void main(String[] args)
	{
		new FlowLayoutEx();
	}
}
