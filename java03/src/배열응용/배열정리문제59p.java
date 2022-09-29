package 배열응용;

import java.util.Scanner;

public class 배열정리문제59p {

	public static void main(String[] args) {

		// 1번)
		int[] num = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int k : num) {
			System.out.print("숫자 입력 >> ");
			num[k] = sc.nextInt();

		}
		System.out.println(num[0] + num[2]);

		
		// 2번)
		String[] lng = new String[3];
		
		for (int i = 0; i < lng.length; i++) {
			System.out.print("언어 입력 >>");
			lng[i] = sc.next();
		}
		System.out.println(lng[0] + "보다는 " + lng[1]);

	}

}
