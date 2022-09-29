package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		int[] num = new int[5];
		
		
		for (int i = 0; i < 5; i++) {
			System.out.print("숫자 입력 >> ");
			num[i] = scanner.nextInt(); //외부에서 들어오는 String을 int로 변환해줌
		
			
		}
		int sum = 0;
		for (int i = 0; i < 5 ; i++) {
			//System.out.println("저장된 데이터는 " + num[i]);
			sum = sum + num[i];
		}
		System.out.println(sum);
		System.out.println(sum / 5);
	//System.out.println("저장된 데이터는 " + data);
	}
}
