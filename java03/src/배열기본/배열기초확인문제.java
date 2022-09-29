package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		
		//1번
		int[] s = new int[5];
		
		//2번
		System.out.println(s.length);

		//3-5번
		s[0] = 100;
		s[s.length - 1] = 500;
		s[2] = 200;
		
		System.out.println(s[0]);
		System.out.println(s[s.length - 1]);
		System.out.println(s[2]);
		
		//6번
		for (int a : s) {
			System.out.println(a);
		
		}
		
		//7번
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + ":" + s[i]);
			
		}
	}

}
