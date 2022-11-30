package hw20_1;
import java.lang.String;
import java.lang.StringBuffer;

//***************************
//파일명: Main.java
//작성자: 임정연
//작성일: 22-11-24
//내용: 'a'부터 'z'까지 반복문을 이용하여 더하되, 개수를 1, 2, 3, ... 증가시켜 문자열 "abbcccddddeeeee...z"을 만들고 마지막에 결과 문자열을 출력
//***************************

public class Main {
	public static void main(String[]args) {
		System.out.println("hw20_1:임정연");

		String s1 = "";
		int n =1; //s1 문자열에 추가하는 것을 반복하기 위해 사용되는 변수이다
		String s2 []= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		long startTime = System.currentTimeMillis();

		for(int i=0; i<s2.length; ++i) {
			for(int j =0; j<n; j++) {
				s1 += s2[i];
			}
			n++;
		}
		long finishTime = System.currentTimeMillis();
		long Time = finishTime - startTime;
		System.out.println("걸린 시간(String):" + Time+"ms");
		System.out.println(s1);

		n=1; //n값 초기화 (이거 초기화 안 해줘서 다시 제출합니당...ㅠㅠ) 
		
		//StringBuffer 클래스 사용
		long sT = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("");
		for(int i=0; i<s2.length; ++i) {
			for(int j =0; j<n; j++) {
				sb.append(s2[i]);
			}
			n++;
		}
		long fT = System.currentTimeMillis();
		long T = fT - sT;
		System.out.println("걸린 시간(StringBuffer):" + T+"ms");
		System.out.println(sb);

	}


}
