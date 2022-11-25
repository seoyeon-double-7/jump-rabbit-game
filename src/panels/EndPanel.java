package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EndPanel extends JPanel {
	
	JButton btnNewButton;
//	JLabel lblNewLabel_1;	// score 글자
	JLabel lblNewLabel_2;	// 점수 글자
	
	
	private int resultScore;
	
	public void setResultScore(int resultScore) {
		lblNewLabel_2.setText(resultScore+"");
	}

	public EndPanel(Object o) {
		
		//점수 글자 
//		lblNewLabel_1 = new JLabel("SCORE");	
//		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
////		lblNewLabel_1.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 37));
//		lblNewLabel_1.setBounds(451, 0, 205, 55);
//		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Harlow Solid Italic", Font.PLAIN, 49));
		lblNewLabel_2.setBounds(313, 52, 459, 87);
		add(lblNewLabel_2);
	}
}
