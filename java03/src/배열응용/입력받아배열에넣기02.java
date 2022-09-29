package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] lastyear = new String[3];
		String[] thisyear = new String[3];

		for (int i = 0; i < lastyear.length; i++) {
			System.out.print("작년에 가고싶었던 곳 세군데 >> ");
			lastyear[i] = sc.next();
		}
		
		for (int i = 0; i < thisyear.length; i++) {
			System.out.print("올해 가고싶은 곳 세군데 >> ");
			thisyear[i] = sc.next();
		}
		
		int where = 0;
		for (int i = 0; i < thisyear.length; i++) {
			if (lastyear[i].equals(thisyear[i])) {
				where++;
			}
		}
		System.out.println("우선순위가 동일한 곳은 : " + where);
	}

}
