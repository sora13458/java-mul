package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		
		//1. 배열 생성 시 값을 이미 알고있는 경우는 {이 안에다가 값을 넣어주면됨}
		int[] s = {1,2,3,4,5,6,7};  // int + {이 안의 값 갯수} + 마지막 갯수세주는 변수 = 총 아홈개의 변수가 생성됨 
		        // 0,1,2,3,4,5,6 -> n번쨰 값을 불러오려면 n-1 위치값을 불러와주면 됨
		System.out.println("s에 저장된 주소>>" + s);
		System.out.println(s[0]); // 1번째 주소에 있는 값
		System.out.println(s[2]); // 3번쨰 주소에 있는 값
		System.out.println(s[5]); // 6번쨰 주소에 있는 값
		
		
		
		int[] s2 = new int[5]; // 새로운 int형 변수를 5칸 만드는 식
		System.out.println("s2에 저장된 주소>>" + s2);
		System.out.println(s2.length);// 배열의 길이가 궁금할때 사용하는 함수
		System.out.println(s2[0]);// 배열의 길이가 궁금할때 사용하는 함수
		
		//값이 안정해진배열의 인덱스에 값 대입하는 방법
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		s2[s2.length-1] = 500; //배열의 마지막 값에 500을 넣는 식
		
		System.out.println(s2[2]);
		System.out.println(s2[s2.length - 1]);
	}

}
