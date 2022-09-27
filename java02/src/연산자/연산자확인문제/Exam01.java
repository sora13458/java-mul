package 연산자.연산자확인문제;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		
		char id = 'd';
		
		String id2 = JOptionPane.showInputDialog("암호를 입력하세요");
		
		if (id2.equals(id)) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
				

	}

}
