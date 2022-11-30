package hw12_1;
//***************************
//파일명: Main.java
//작성자: 임정연
//작성일: 22.11.18
//내용: Animal이라는 추상클래스와, 이를 상속하는 Dog, Person 클래스를 정의하고 이용하는 프로그램을 작성하시오.
//Dog는 "멍멍 자신의이름"이라는 소리를 내고, 한 해가 지나가면 속도가 5 증가한다.
//Person은 "안녕 자신의이름"이라는 소리를 내고, 한 해가 지나가면 나이가 1 증가한다.
//***************************

abstract class Animal {
	String name; // 속성 이름

	public void Name(String name) { // 이름을 매개변수로 받아 초기화하는 생성자
		this.name = name;
	}

	public String getName() { // 이름에 대한 getter
		return name;
	}

	public abstract String sound(); // 어떤 소리를 내는지를 출력하는 메소드

	public abstract double newYear(); // 한 해가 지날 떄 해야할 일을 정의한 메소드

	@Override
	public String toString() {
		return "";
	}
}

class Dog extends Animal {
	double speed; // 속도

	public Dog(String name, double speed) {
		this.name = name;
		this.speed = speed;
	}

	public String sound() { // "멍멍 + 자신의 이름" 소리를 냄
		return "멍멍 " + name;
	}

	public double newYear() { // 한 해가 지나면 속도 +5
		return speed += 5;
	}

	@Override
	public String toString() { // toString 오버라이드
		return name + " " + "시속" + speed + "km";
	}
}

class Person extends Animal {
	double age; // 나이

	public Person(String name, double age) {
		this.name = name;
		this.age = age;
	}

	public String sound() { // "안녕 + 자신의 이름" 소리를 냄
		return "안녕 " + name;
	}

	public double newYear() { // 한 해가 지나면 나이+1
		return age += 1;
	}

	@Override
	public String toString() { // toString 오버라이드
		return name + " " + age + "세";
	}

}

public class Main {
	public static void main(String[] args) {
		System.out.println("hw12_1:임정연" + "\n");
		Animal[] animal = new Animal[4]; // 크기가 4인 Animal 배열 생성
		animal[0] = new Dog("진돌이", 13.5);
		animal[1] = new Dog("진순이", 12.5);
		animal[2] = new Person("홍길동", 20);
		animal[3] = new Person("박길동", 25);

		for (int i = 0; i < 4; i++) {
			System.out.println(animal[i]);
			System.out.println(animal[i].sound()); // sound() 메소드 출력
		}

		System.out.println("------ 1년 후 ------");
		for (int i = 0; i < 4; i++) {
			animal[i].newYear();
			System.out.println(animal[i]);
		}

		System.out.println("------ 2년 후 ------");
		for (int i = 0; i < 4; i++) {
			animal[i].newYear();
			System.out.println(animal[i]);
		}
	}
}
