package chap04;
import java.util.Scanner;

/*
 	[윤년 계산 프로그램]
 	사용자에게 년도를 입력 받아 윤년여부를 판단하여 출력하는 코드를 작성하세요.
 	
 	[실행 결과1]
 	년도를 입력하세요: 2023
 	입력하신 ---년도는 평년입니다.
 	
 	[실행 결과2]
 	년도를 입력하세요: 2020
 	입력하신 ---년도는 윤년입니다.
 	
 	[윤년 판단 알고리즘]
 	1.4의 배수인 해는 윤년입니다.
 	2.100의 배수인 해는 평년입니다.
 	3.400의 배수인 해는 윤년입니다.
 	
 	=> 2023년 : 평년, 2020년: 윤년 , 1900년: 평년, 2000년: 윤년
 	100으로 나누어 떨어지되 400으로 나누어 떨어지지 않는 해는 평년으로 한다.
 	가령 400으로 나누어 떨어지는 2000년은 그레고리력으로 윤년이지만, 100으로는 나누어 떨어지되 400으로는 나누어 떨어지지 않는 1900년은 평년이다. 
 	물론 율리우스력으로는 1900년이든 2000년이든 모두 윤년이다.
 	
 	[코드 작성 조건]
 	1. if ... else if ... else 구문 이용하여 문제를 해결 하세요.
 	2. if.. else 구문을 이용하여 문제를 해결하세요.
 	
 
 */

public class Exam3 {

	public static void main(String[] args) {
		 //1번
		/*
		Scanner sc = new Scanner(System.in);
		
		int year;
		String result = "";
		
		System.out.print("년도를 입력하세요: ");
		year = sc.nextInt();
		
		sc.close();
		
		if(year % 400 ==0) {
			result = "윤년";
		}else if(year % 100 ==0) {
			result = "평년";
		}else if(year % 4 ==0) {
			result = "윤년";
		}else {
			result = "평년";
		}
		
		System.out.printf("입력하신 %d년은 %s입니다",year,result);
		
		*/
		
		//2
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		String result = "";
		
		System.out.print("년도를 입력하세요: ");
		year = sc.nextInt();
		
		sc.close();
		
		if( (year %4 ==0 && year%100 !=0) || year%400==0 ) {
			result ="윤년";
		}else {
			result ="평년";
		}
		
		System.out.printf("입력하신 %d년은 %s입니다",year,result);
		
		
		
		/* 내가한거 ↓
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.print("년도를 입력하세요: ");
		num=sc.nextInt();
		
		
		if(num%400 == 0) {
			System.out.printf("입력하신 %d년은 윤년입니다.",num);
		}else if(num%100 == 0 && num%400 != 0) {
			System.out.printf("입력하신 %d년은 평년입니다.",num);
		}else if(num%4 == 0) {
			System.out.printf("입력하신 %d년은 윤년입니다.",num);
		}else{
			System.out.printf("입력하신 %d년은 평년입니다.",num);
		}
		
		sc.close();
		
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.print("년도를 입력하세요: ");
		num=sc.nextInt();
		
		if(num%400 ==0 || num%4==0 || num%100==0 && num%400 != 0 ){
			System.out.printf("입력하신 %d년은 윤년입니다.",num);
		}else{
			System.out.printf("입력하신 %d년은 평년입니다.",num);
		}
		*/
		
				
		 
	}
	
	
}
