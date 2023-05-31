package chap04;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 90) {
			System.out.println("참잘했습니다~!");
		}else if(score >=80) {
			System.out.println("잘했습니다~!");
		}else if(score >=70) {
			System.out.println("보통입니다~!");
		}else if(score >=60) {
			System.out.println("좀 더 노력하세요");
		}else {
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("프로그램종료");
		
		
	}

}
