package 배열응용;

import java.util.Scanner;

public class 우리집식구들 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] name = {"아버지", "어머니", "나"};
		int[] age = {100, 50, 20};
		double[] height = {177.7, 162.2, 163.3};
		
		//나에 대한 정보만 출력하기
		System.out.println("우리 식구들");
		System.out.println("호칭" + "\t" + "나이" + "\t" + "키");		
		System.out.println("------------------------------");
		System.out.println(name[0] +"\t"+ age[0] +"\t"+ height[0]);
		System.out.println(name[1] +"\t"+ age[1] +"\t"+ height[1]);
		System.out.println(name[2] +"\t"+ age[2] +"\t"+ height[2]);

	}

}
