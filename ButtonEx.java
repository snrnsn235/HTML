import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("src/�̻���.jpg");
		
		JButton btn = new JButton("fdafas", normalIcon);
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
