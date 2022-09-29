package 배열응용;

import java.util.Random;

public class 토익문제채점02 {

	public static void main(String[] args) {

		int[] answer = new int[990];
		int[] myanswer = new int[990];

		Random r = new Random();

		for (int i = 0; i < answer.length; i++) {
			answer[i] = r.nextInt(4) + 1;
			myanswer[i] = r.nextInt(4) + 1;
			System.out.println("번호" + (i + 1) +"\t" + answer[i] + "\t" + myanswer[i]);
		}

		int score = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == myanswer[i]) {
				score++;
			}

		}
		System.out.println();
		System.out.println("점수"+ "\t" + score);
	}

}
