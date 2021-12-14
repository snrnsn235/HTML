import java.awt.*;
import javax.swing.*;

public class program extends JFrame {
	public program() {
		setTitle("이재협이 쓰던 폰");
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
		JLabel LgLabel = new JLabel(new ImageIcon("src/lg폰.jpg"));
		LgLabel.setToolTipText("아는 누나가 미국가기전에 주고간 나의 첫 핸드폰입니다.");
		pane.addTab("첫 핸드폰은 LG 김태희 폰", LgLabel);
				
		JLabel samsungLabel = new JLabel(new ImageIcon("src/폴더폰.jfif"));
		samsungLabel.setToolTipText("가족과 같이 산 삼성폴더폰입니다. 고등학교 내내 사용했답니다.");
		pane.addTab("두번째 핸드폰은 삼성 아무 폴더폰", samsungLabel);
		
		JLabel Lg2Label = new JLabel(new ImageIcon("src/옵티머스.jpg"));
		Lg2Label.setToolTipText("생애 첫 스마트폰은 LG 옵티머스였습니다. 성능은 말못할정도...");
		pane.addTab("세번째 핸드폰은 LG 1세대 스마트폰", Lg2Label);
		
		JLabel note3Label = new JLabel(new ImageIcon("src/note3.jfif"));
		note3Label.setToolTipText("군대 다녀와서 산 그 당시 최신폰");
		pane.addTab("네번째는 삼성 노트3", note3Label);
		
		JLabel IphoneLabel = new JLabel(new ImageIcon("src/아이폰7.jpg"));
		IphoneLabel.setToolTipText("호주에서 500달러 주고산 예쁜 로즈골드 첫 애플폰");
		pane.addTab("다섯번째는 애플 아이폰 7", IphoneLabel);
		
		JLabel Iphone12Label = new JLabel(new ImageIcon("src/아이폰12pro.jfif"));
		Iphone12Label.setToolTipText("큰맘먹고 산 아이폰12pro 사진찍기너무 좋아요");
		pane.addTab("여섯번째는 애플 아이폰 12 pro", Iphone12Label);
		
		
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		return pane;
	}
		
	

	public static void main(String[] args) {
	new program();
	}

}
