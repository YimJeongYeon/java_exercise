package hw7_1;

//***************************
//파일명: Car2Test.java
//작성자: 임정연
//작성일: 2022-10-12
//내용: CarTest.java 예제를 참고하여 자동차 클래스 Car2를 다음과 같이 정의하고 이용하는 프로그램을 작성하시오.
//***************************

class Car2 {
	 String color; //색상
	 int speed; //현재 속도
     int gear; //현재 기어

	public void print() { //정보 출력 메소드
		System.out.println("(" + color + "," + speed + "," + gear + ")");
	}

	public int speedUp() { //속도를 1 증가하고 변경된 속도를 리턴

		speed += 1;
		return speed;
	}
	
	public int changeGear(int a) { //매개변수로 받은 값으로 기어를 변경
		return gear = a;
	}
}
public class Car2Test {
	public static void main(String[] args) {

		System.out.println("hw7_1 : 임정연");

		Car2 myCar = new Car2(); //객체 생성
		myCar.color = "red";
		myCar.speed = 0;
		myCar.gear = 1;
		myCar.print();

		for(int i=0; i<20; i++) { //속도증가 메소드 20번 호출
			myCar.speedUp();
		}
		myCar.print();

		myCar.changeGear(2); //기어변속 메소드를 호출하여 기어를 2로 변경
		myCar.print();

		for(int i=0; i<20; i++) { //속도증가 메소드 20번 호출
			myCar.speedUp();
		}
		myCar.print();



	}

}
