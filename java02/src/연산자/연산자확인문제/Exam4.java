package 연산자.연산자확인문제;

public class Exam4 {

	public static void main(String[] args) {
		
		//1학기 성적
		int pe = 66;
		int math = 77;
		int eng = 88;
		int kor = 99;

		//인트 더블로 변경
		int total = pe + math + eng + kor ;
		
		Double total1 = Double.parseDouble(total);
		
		System.out.println(total1 / 4);
		
	}

}
