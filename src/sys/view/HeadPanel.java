package sys.view;

import java.awt.Cursor;
import java.awt.Label;
import java.net.URL;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeadPanel extends ImagePanel{

	public HeadPanel(URL imageUrl) {
		
		super(imageUrl);
		setBounds(0,0,1000,80);
		setLayout(null);
		JLabel label=new JLabel("���ѽ��");
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setBounds(840, 0, 60, 30);
		JLabel label1=new JLabel("����");
		label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label1.setBounds(900,0,40, 30);
		JLabel label2=new JLabel("��¼");
		label2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label2.setBounds(940,0, 40, 30);
add(label2);
add(label1);
		add(label);
	}

}
