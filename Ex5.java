package chap04;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String grade ="";
		
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		sc.close();
		
		if(score >= 98) {
			grade="A+";
		}else if(score >=94) {
			grade="A";
		}else if(score >=90) {
			grade="A-";
		}else if(score >=88) {
			grade="B+";
		}else if(score >=84) {
			grade="B";
		}else if(score >=80) {
			grade="B-";
		}else {
			grade="C";
		}
		
		System.out.printf("당신의 학점은 %s 입니다.",grade);
		
		
	}

}
