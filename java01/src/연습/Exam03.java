package 연습;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		
		String tel = JOptionPane.showInputDialog("통신사를 입력하세요");
		String num = JOptionPane.showInputDialog("전화번호를 입력하세요");
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		
	
		
		int result = Integer.parseInt(name + "님은 " + tel + "에 " + num );
		
		JOptionPane.showMessageDialog(null, result + "로 가입되셨습니다");
		
	}

}
