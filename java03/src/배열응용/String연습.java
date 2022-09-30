package 배열응용;

public class String연습 {

	public static void main(String[] args) {
		
		String s = "나는 프로그래머야";
		String s2 = "진짜!";
		
		System.out.println( s + s2 );
		System.out.println(s.concat(s2));
		System.out.println(s.charAt(0));//자릿수에 있는 문자 한글자 추출
		System.out.println(s.endsWith("야"));//특정 문자로 끝나는지 확인
		System.out.println(s.substring(3));//인덱스 3 이후의 글자들 모두 추출
		System.out.println(s.substring(3, 8));//인덱스 3-7까지의 글자 추출
		System.out.println(s.contains(s2));//s에 s2가 포함되어 있는지?
		System.out.println(s.lastIndexOf("프"));//인덱스의 프 위치를 알려
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace("나", "너"));
		System.out.println();
		System.out.println("--------------------------");
		
		
		String num = "011-245-1234";
		
		if (num.substring(0,3).equals("011")) {
			System.out.println("sk");
		} else if (num.substring(0,4).equals("019")) {
			System.out.println("LG");		
		}else {
			System.out.println("Apple");
		}

		String a = num.substring(4,7);
		int len = a.length();
		
		if (len >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}
		
		if (num.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
	
		String x = "감자,고구마,양파";
		String[] x2 = x.split(","); //,를 기준으로 문자를 나누고 배열을 만들어주는 방법
		System.out.println(x2[0]);
		
		String[] i = num.split("-");
		System.out.println(i);
		
		
		
		
	}

}
