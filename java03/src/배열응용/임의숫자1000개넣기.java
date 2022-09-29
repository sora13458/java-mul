package 배열응용;

import java.util.Random;

public class 임의숫자1000개넣기 {

	public static void main(String[] args) {
	
		//1000개 데이터 넣기
		//1.공간만들기
		//2.랜덤값 만들어주는 부품을 만들어라
		//3.반복으로 랜덤값 1000개 만든 후 저장공간에 넣어라
		//4. 1000개 프린트

		int[] lotto = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(44) + 1;
			
		}
		for (int x : lotto) {
			System.out.print(x + " ");
		}
	}

}