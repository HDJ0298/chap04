package chap04;
import java.util.Scanner;

/*
사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
  실행결과1-
  하나의 실수를 입력하세요> 3.64
  버림: 3
  반올림: 4
  올림: 4
  
  실행결과2-
  하나의 실수를 입력하세요: 6.2364
  버림: 6
  반올림:6
  올림:7
  
  실행결과3-
  하나의 실수를 입력하세요: 4.0
  버림: 4
  반올림:4
  올림: 4
  
*/

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.print("실수를 입력하세요: ");
		num=sc.nextDouble();
		sc.close();
		
		System.out.println("버림: "+(int)num);
		System.out.println("반올림: "+(int)(num+0.5));
		
		//9.0/1
		
		if(num == (int)num) {
			System.out.println("올림: "+(int)(num));
		}else{
			System.out.println("올림: "+(int)(num+1));
		}
		
		
	}

}
