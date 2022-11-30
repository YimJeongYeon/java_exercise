package hw9_1;

//***************************
//파일명: TelevisionTest.java
//작성자: 임정연
//작성일: 22.11.02
//내용: 이제까지 생성된 텔레비젼 수를 Television 클래스에게 물어보아 알아내어 출력 
//***************************

public class TelevisionTest {

	public static void main(String[] args) {
		
		System.out.println("hw9_1 : 임정연");
		
		Television tv1 = new Television(); //텔레비젼 객체 tv1
		Television tv2 = new Television("STV-100");  //텔레비젼 객체 tv2
		Television tv3 = new Television("STV-200",20000000);  //텔레비젼 객체 tv3

		System.out.println(tv1.toString()); //으로 해도 됨
		System.out.println(tv2.toString()); 
		System.out.println(tv3.toString()); 
		
		int a = tv1.getNumberOfTVs();
		int b = tv2.getNumberOfTVs();
		int c = tv3.getNumberOfTVs();
		
		System.out.printf("텔레비젼 객체 수:" + a + "\n");
		System.out.printf("텔레비젼 객체 수:" + b + "\n");
		System.out.printf("텔레비젼 객체 수:" + c);
	}

}
