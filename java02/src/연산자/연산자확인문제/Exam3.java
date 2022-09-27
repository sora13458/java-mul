package 연산자.연산자확인문제;


public class Exam3 {

	public static void main(String[] args) {
		char id = 'd';
		char id2 = 'd';
		

		double yesterday = 50;
		double today = yesterday - 2.2;
		
		if (id2 == id && (yesterday - today) > 2 ) {
			System.out.println("오늘도 성공!");
			
		}else {
			System.out.println("내일 다시 도전!");
		}
				
	}

}
