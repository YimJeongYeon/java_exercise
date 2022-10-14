package hw6_1;
import java.util.Scanner;

//파일명 : Semester.java
//작성자 : 임정연
//작성일 : 22.09.30
//내용 : 대학에 1~4학년까지 있고, 학기는 1~8학기까지 있다고 보자,사용자로부터 학기를 입력받아 학년을 출력하는 프로그램을 작성하시오.

public class Semester {

	public static void main(String[] args) {
		System.out.println("hw6_1 : 임정연\n");
		String b =""; // 출력해줄 학년
		
		while(true) {
			System.out.println("학기를 입력하시오: ");
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt(); //입력 받은 학기
			
			if(a>=9) {
				System.out.println("학기를 다시 입력해주세요.\n");
				continue;
			}
			else {
				switch(a) {
				case 1:
					b="1학년";
					break;
				case 2:
					b="1학년";
					break;
				case 3:
					b="2학년";
					break;
				case 4:
					b="2학년";
					break;
				case 5:
					b="3학년";
					break;
				case 6:
					b="3학년";
					break;
				case 7:
					b="4학년";
					break;
				case 8:
					b="4학년";
					break;
				default:
					System.out.println("학년을 잘못 입력하셨습니다.");
					break;
				}
			}
			System.out.println(b);
			break;
		}
	
	}
		

}

