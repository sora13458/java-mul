package 배열기본;

public class 배열만들기2 {

	public static void main(String[] args) {
		
		//문제 29번
		int[] num = new int[5];
		
		//위치값의 이름 = index
		num[0] = 100;
		num[1] = 200;
		
		//for 문은 유한한 배열을 출력할때 자주 사용된다
		// 여기서 i는 index의 i
		for (int i = 0; i < num.length; i++) { 
			System.out.println(num[i]);
		}
		
		
		//처음부터 하나씩 뒤로 읽어가면서 값을 꺼내오는 반복문
		//여기서 x는 int의 역할
		for (int x : num) {
			System.out.println(num[x]);
		}
	}

}
