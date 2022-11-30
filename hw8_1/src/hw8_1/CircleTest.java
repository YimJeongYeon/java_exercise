package hw8_1;

//***************************
//파일명: CircleTest.java
//작성자: 임정연
//작성일: 2022-10-14
//내용: 원을 나타내는 클래스를 정의하고 이를 이용하는 프로그램
//***************************

class Circle{
	private double radius; //반지름
	private double x1; //x좌표
	private double y1;  //y좌표
	
	public void setRadius(double r) {
		if(r < 0) { //반지름을 음수로 설정하려고 시도하면 음수 대신 1.0으로 설정
			r = 1.0;
		}
		this.radius = r;
	}
	public double getRadius() {
		return radius;
	}
	

	public void setX(double x) {
		this.x1 = x; //필드에서 지정한 X는 매개변수 X이다 (인스턴스 변수에 매개변수 값 대입이란 말씀)
	}
	public double getX() {
		return this.x1;
	}

	
	public void setY(double y) {
		this.y1 = y;
	}
	public double getY() {
		return this.y1;
	}
	


	public double area() { //원의 면적을 계산하여 리턴하는 메소드
		double area = 3.14*radius*radius;
		return area;
	}

	public void move(double x, double y) { //x축 이동거리와 y축 이동거리를 매개변수로 받아 x,y 좌표에 더함
		this.x1 +=x;
		this.y1+=y;
	}

}


public class CircleTest {

	public static void main(String[] args) {
		System.out.println("hw8_1 : 임정연\n");


		Circle circle1 = new Circle();
		Circle circle2 = new Circle();

		circle1.setX(3);
		circle1.setY(4);
		circle1.setRadius(1.2);
		circle1.move(10, 20);


		circle2.setX(-3);
		circle2.setY(-4);
		circle2.setRadius(-1.2);
		circle2.move(10, 20);
		
		//circle1&circle2 에게 각자의 현재 x,y좌표와 면적을 물어보아 알아내어 출력
		double a = circle1.getX();
		double b = circle1.getY();
		double c = circle1.area();
		
		double d = circle2.getX();
		double e = circle2.getY();
		double f = circle2.area();
		

		System.out.println("circle1의 현재 x좌표:" + a + ", circle1의 현재 y좌표:" + b + ", circle1의 면적:" + c + "\n");
		System.out.println("circle2의 현재 x좌표:" + d + ", circle2의 현재 y좌표:" + e + ", circle2의 면적:" + f );

	}


}
