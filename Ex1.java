package chap04;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 70) {
			System.out.println("합격입니다~!");
			System.out.println("축하합니다~!");
		}
			System.out.println("프로그램종료~!");
		
		
		
	}

}
