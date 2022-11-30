package hw20_2;

import java.util.Scanner;

//***************************
//파일명: Exercise.java
//작성자: 임정연
//작성일: 22-11-25
//내용: java.lang 패키지의 클래스를 이용하여 다음 작업을 수행하는 프로그램을 작성하시오.
//***************************

public class Excersice {
	public static double PI = 3.14;
	public static void main(String[]args) {
		System.out.println("hw20_2:임정연");
		System.out.println(PI*1.5*1.5);
		System.out.println(Math.pow(3,10));
		System.out.println(Math.sqrt(8));
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요(-포함):");
		String personalNo = sc.next();
		
		String[] split = personalNo.split("-");
		int s1 = Integer.parseInt(split[0]);
		int s2 = Integer.parseInt(split[1]);
		System.out.println("앞자리: "+s1);
		System.out.println("뒷자리: "+s2);
		System.out.println("합: "+(s1+s2));
	}

}
