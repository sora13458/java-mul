package 배열기본;

public class 타입판단 {

	public static void main(String[] args) {
		
		// 좋아하는 여행지 5곳
		String[] t = new String[5];
		
		t[0] = "강릉";
		t[1] = "삿포로";
		t[2] = "마드리드";
		t[3] = "잘츠부르크";
		t[4] = "제주도";
		
		for (int i = 0; i < t.length; i++) {
			System.out.println(t[i]);
		}
		
		// 좋아하는 색의 첫글자
		char[] c = new char[5];

		c[0] = 'P';
		c[1] = 'S';
		c[2] = 'R';
		c[3] = 'Y';
		c[4] = 'G';
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		double[] h = new double[5];
		
		h[0] = 190.0;
		h[1] = 184.3;
		h[2] = 180.0;
		h[3] = 178.2;
		h[4] = 165.5;
		
		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i]);
		}
		
	
	}

}
