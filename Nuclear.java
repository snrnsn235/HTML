import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nuclear extends JFrame {
	public Nuclear() {
		setTitle("Nuclear");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(500, 200);
		c.add(new MyPanel(), BorderLayout.NORTH);
		setVisible(true);
	}
	class MyPanel extends Panel {
		private JButton inputBtn = new JButton("위치");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("재확인");
		private JButton messageBtn = new JButton("마무리");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("나라를 입력하세요.");
					if(name !=null)
						tf.setText(name);;
				}
			});	
			
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "정말 미사일을 발사하시겠습니까?",
							"Confirm", JOptionPane.YES_NO_OPTION);
					
					if(result == JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if(result == JOptionPane.YES_OPTION)
						tf.setText("Yes");
					else
						tf.setText("No");
				}
			});
			
			messageBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "발사되었습니다.", "Message", JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}	
	}
	
	
	public static void main(String[] args) {
		new Nuclear();
	}
		

}
