package hw12_2;
//***************************
//파일명: Driver.java
//작성자: 임정연
//작성일: 22.11.18
//내용: Speakable 인터페이스를 구현하는 Dog 클래스와 AlarmClock 클래스를 정의하고 객체를 하나씩만 생성하여 이용하는 프로그램이다.
//Dog, AlarmClock이라는 클래스 이름을 사용하지 않고 아래와 동일한 기능을 하도록 프로그램을 수정하시오.
// 무명 클래스(anonymous class) 개념을 이용할 것
//***************************


//speak() 메소드를 갖는 Speakable 인터페이스
interface Speakable {
	// 어떤 소리를 내는지 출력하는메소드
	public void bark(); //멍멍
	public void ring(); //삐삐
}

//Dog 객체와 AlarmClock 객체를 하나씩만 생성하고 이용하는 드라이버 클래스
public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_2:임정연" + "\n");
		
		Speakable s = new Speakable() {
			public void bark() {
				System.out.println("멍멍");
			}
			private int number = 5;
			  public void ring() {
			      for(int i=0; i<number; i++)
			         System.out.print("삐");
			      System.out.println();
			      number = number + 3;
			   }
		};
		s.bark();
		s.ring();
		s.ring();
	}
}


