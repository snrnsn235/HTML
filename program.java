import java.awt.*;
import javax.swing.*;

public class program extends JFrame {
	public program() {
		setTitle("�������� ���� ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		JTabbedPane pane = createTabbedPane();
		c.setLayout(new FlowLayout());
		c.add(pane, BorderLayout.CENTER);
		setSize(250, 250);
		setVisible(true);
	}
	
	private JTabbedPane createTabbedPane() {
		JTabbedPane pane = new JTabbedPane();
		JLabel LgLabel = new JLabel(new ImageIcon("src/lg��.jpg"));
		LgLabel.setToolTipText("�ƴ� ������ �̱��������� �ְ� ���� ù �ڵ����Դϴ�.");
		pane.addTab("ù �ڵ����� LG ������ ��", LgLabel);
				
		JLabel samsungLabel = new JLabel(new ImageIcon("src/������.jfif"));
		samsungLabel.setToolTipText("������ ���� �� �Ｚ�������Դϴ�. ����б� ���� ����ߴ�ϴ�.");
		pane.addTab("�ι�° �ڵ����� �Ｚ �ƹ� ������", samsungLabel);
		
		JLabel Lg2Label = new JLabel(new ImageIcon("src/��Ƽ�ӽ�.jpg"));
		Lg2Label.setToolTipText("���� ù ����Ʈ���� LG ��Ƽ�ӽ������ϴ�. ������ ����������...");
		pane.addTab("����° �ڵ����� LG 1���� ����Ʈ��", Lg2Label);
		
		JLabel note3Label = new JLabel(new ImageIcon("src/note3.jfif"));
		note3Label.setToolTipText("���� �ٳ�ͼ� �� �� ��� �ֽ���");
		pane.addTab("�׹�°�� �Ｚ ��Ʈ3", note3Label);
		
		JLabel IphoneLabel = new JLabel(new ImageIcon("src/������7.jpg"));
		IphoneLabel.setToolTipText("ȣ�ֿ��� 500�޷� �ְ�� ���� ������ ù ������");
		pane.addTab("�ټ���°�� ���� ������ 7", IphoneLabel);
		
		JLabel Iphone12Label = new JLabel(new ImageIcon("src/������12pro.jfif"));
		Iphone12Label.setToolTipText("ū���԰� �� ������12pro �������ʹ� ���ƿ�");
		pane.addTab("������°�� ���� ������ 12 pro", Iphone12Label);
		
		
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		return pane;
	}
		
	

	public static void main(String[] args) {
	new program();
	}

}
