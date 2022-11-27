package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import panels.EndPanel;
import panels.GamePanel;
import panels.SelectPanel;
import main.listenAdapter;
import object.Rabbitimg;

import java.awt.CardLayout;

public class Main extends listenAdapter {
//
	private JFrame frame;

	private SelectPanel selectPanel;

	private GamePanel gamePanel;

	private EndPanel endPanel;

	private CardLayout cl;

	private Rabbitimg ci;

	public GamePanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	public EndPanel getEndPanel() {
		return endPanel;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cl = new CardLayout(0, 0);
		frame.getContentPane().setLayout(cl);
		System.out.println(frame.getSize());

		selectPanel = new SelectPanel(this);
		gamePanel = new GamePanel(frame, cl, this);
		endPanel = new EndPanel(this);

		selectPanel.setLayout(null);
		gamePanel.setLayout(null);
		endPanel.setLayout(null);

		frame.getContentPane().add(selectPanel, "select");
		frame.getContentPane().add(gamePanel, "game");
		frame.getContentPane().add(endPanel, "end");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		//start button 누르면 게임 시작
		if (e.getComponent().getName().equals("StartBtn")) {
			if (selectPanel.getCi() == null) {
				JOptionPane.showMessageDialog(null, "캐릭터를 골라주세요"); // 캐릭터를 안골랐을경우 팝업
			} else {
				cl.show(frame.getContentPane(), "game"); // 캐릭터를 골랐다면 게임패널을 카드레이아웃 최상단으로 변경
				gamePanel.gameSet(selectPanel.getCi()); // 쿠키이미지를 넘겨주고 게임패널 세팅
				gamePanel.gameStart(); // 게임시작
				gamePanel.requestFocus(); // 리스너를 game패널에 강제로 줌
			}
		} 
	}
}
