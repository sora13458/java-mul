package 배열응용;

public class 참조형복사 {

	public static void main(String[] args) {

		//보통 주소가 복사되는 참조형 복사(얕은 복사)
		int[] n1 = {100, 200, 300};
		int[] n2 = n1;
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
	
		int[] n3 = n1.clone();
		System.out.println("n1:" + n1);
		System.out.println("n3:" + n3);
		
		System.out.println("값 변경 전===============");
		for (int x : n3) {
			System.out.println(x + "");
		}
		System.out.println();
		for (int x : n3) {
			System.out.println(x + "");
			
		
		}
		
		System.out.println("값 변경 후=========");
		
		n3[0] = 999;
		for (int a : n3) {
			System.out.println(a+"");
		}
	}
	
	

}
