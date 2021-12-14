import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("src/미사일.jpg");
		
		JButton btn = new JButton("fdafas", normalIcon);
		c.add(btn);
		
		setSize(250, 150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ButtonEx();
	}

}
