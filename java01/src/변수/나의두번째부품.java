package 변수;

import javax.swing.JOptionPane;

public class 나의두번째부품 {

	public static void main(String[] args) {
		
		//자주쓰는 기능들은 대문자로 바로 쓸수있도록 돼있음
		//나의 취미
		//나의 이름
		//입력용
		
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요");
		// 출력용
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요");
	
		JOptionPane.showMessageDialog(null, "나의 이름은 " + name);
		
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요");
		
		JOptionPane.showMessageDialog(null, "나의 취미는 " + hobby);

		
	}	

}
