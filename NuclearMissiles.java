import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class thanks extends JDialog {
		private JTextField tf = new JTextField(10);;
		private JButton okButton = new JButton("�߻�");
		
		public thanks(JFrame frame, String title) {
			super(frame, title);
			setLayout(new FlowLayout());
			add(tf);
			add(okButton);
			setSize(200, 100);
			
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});	
		}
		public String getInput() {
			if(tf.getText().length() == 0) return null;
			else return tf.getText();
		}
}

public class NuclearMissiles extends JFrame {
	private thanks dialog;
	public NuclearMissiles() {
		super("Ŭ���ѹ����� ���� �ִ԰�����~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		c.setLayout(new FlowLayout());
		
		
		ImageIcon normalIcon = new ImageIcon("src/�̻���.jpg");
		
		JButton btn = new JButton("Ŭ���ѹ����� ���� �߻�!!", normalIcon);
		dialog = new thanks(this, "����� �Ǵ� ���� �Է��ϼ���");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dialog.setVisible(true);
			
			String text = dialog.getInput();
			
			
			}
		});
		
		c.add(btn);
		setSize(500, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new NuclearMissiles();
	}

}
