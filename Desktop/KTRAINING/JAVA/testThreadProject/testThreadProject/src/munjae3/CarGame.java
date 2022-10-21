package munjae3;

import javax.swing.*;

public class CarGame extends JFrame {
	
	private JLabel label1, label2, label3;	// 글자에 그림 아이콘 추가 할 수 있음
	
	public CarGame() {
		this.setTitle("CarRace");
		this.setSize(700, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("images/car1.gif"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("images/car2.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("images/car3.gif"));
		
		add(label1);
		add(label2);
		add(label3);
		
		label1.setBounds(10, 0, 50, 50);
		label2.setBounds(10, 50, 50, 50);
		label3.setBounds(10, 100, 50, 50);
		
		new CarRace().start();
		
		this.setVisible(true);
		
	}
	
	//======================================================
	//내부클래스 : 멤버로 취급함(private, static 사용할 수 있음)
	private class CarRace extends Thread {
		private int x1 = 10, x2 =10, x3 =10;
		
		@Override
		public void run() {
			for(int p = 1; p <= 120; p++) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int)(Math.random() * 10);
				label1.setBounds(x1, 0, 50, 50);
				x2 += (int)(Math.random() * 10);
				label2.setBounds(x2, 50, 50, 50);
				x3 += (int)(Math.random() * 10);
				label3.setBounds(x3, 100, 50, 50);
			}
		}
	}
	
	//======================================================
	public static void main(String[] args) {
		new CarGame();

	}

} // main class end
