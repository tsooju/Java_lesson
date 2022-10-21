package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 버튼 하나 있는 윈도우 창 만들기 
// 클래스와 인터페이스를 같이 상속 받을 수 있음.
// extends 클래스(단일 상속), implements 인테페이스(다중산속) 
public class MyWindow extends JFrame 
	implements ActionListener, KeyListener {
	// Field
	private JButton btn = new JButton("클릭하세요");
	
	//Constructor
	public MyWindow() {
		super("상속 테스트");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(btn);	// window 창의 버튼 위치

		this.btn.addActionListener(this);	// 버튼 이벤트
		this.setVisible(true); // 보여지게 하라
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionListener가 가지고 있는 메소드이며 강제로 상속 시킴
		// 인터페이스가 가진 추상(미완성) 메소드를 강제적으로 완성해야 함
		// 상속받은 추상메소드 오버라이딩
		// 버튼이 클릭 되면 : 
		JOptionPane.showInputDialog(this, "버튼이 클릭되었습니다.");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
