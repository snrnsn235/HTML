import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class thanks extends JDialog {
		private JTextField tf = new JTextField(10);;
		private JButton okButton = new JButton("발사");
		
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
		super("클릭한번으로 적을 주님곁으로~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		c.setLayout(new FlowLayout());
		
		
		ImageIcon normalIcon = new ImageIcon("src/미사일.jpg");
		
		JButton btn = new JButton("클릭한번으로 핵을 발사!!", normalIcon);
		dialog = new thanks(this, "대상이 되는 나라를 입력하세요");
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
