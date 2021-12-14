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
		private JButton inputBtn = new JButton("��ġ");
		private JTextField tf = new JTextField(10);
		private JButton confirmBtn = new JButton("��Ȯ��");
		private JButton messageBtn = new JButton("������");
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("���� �Է��ϼ���.");
					if(name !=null)
						tf.setText(name);;
				}
			});	
			
			confirmBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null, "���� �̻����� �߻��Ͻðڽ��ϱ�?",
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
					JOptionPane.showMessageDialog(null, "�߻�Ǿ����ϴ�.", "Message", JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}	
	}
	
	
	public static void main(String[] args) {
		new Nuclear();
	}
		

}
