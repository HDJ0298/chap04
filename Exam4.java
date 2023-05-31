package chap04;

import java.util.Scanner;

/*
  월의 마지막 일자 계산 프로그램 작성하기
  
  [실행 예1]
  년도와 월을 입력하세요: 2023 1
  2023년 1월의 마지막 일자는 31일입니다.
  
  [실행 예1]
  년도와 월을 입력하세요: 2020 2
  2020년 2월의 마지막 일자는 29일입니다.
  
  [각 월의 마지막 일자]
  1. 큰달: 1,3,5,7,8,10,12  === 31일
  2. 작은달: 4,6,9,11 === 30일
  3. 2월: 윤년-29일 평년-28일
  
 */

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year,month, monthLastDay=31;
		System.out.printf("년도와 월을 입력하세요: ");
		year = sc.nextInt();
		month= sc.nextInt();
		
		switch(month) {
			case 4:	case 6:	case 9:	case 11:
				monthLastDay=30;
				break;
			case 2:
				if( (year %4 ==0 && year%100 !=0) || year%400==0 ) {
					monthLastDay=29;
				}else {
					monthLastDay=28;
				}
				break;
		}
		
		System.out.printf("입력하신 %d년의 %d월의 마지막날짜는 %d일 입니다.",year,month,monthLastDay);
		
	
		
		/* 내가한거 ↓
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.printf("년도와 월을 입력하세요: ");
		num1 = sc.nextInt();
		num2= sc.nextInt();
		
		switch(num2) {
			case 1:
			case 3:
			case 5:
		    case 7:
		    case 8:
		    case 10:
		    case 12:
		    	System.out.printf("%d년 %d월의 마지막 일자는 31일 입니다",num1,num2);
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.printf("%d년 %d월의 마지막 일자는 30일 입니다",num1,num2);
		    	break;
		    case 2:
		    	if(num1%400 == 0 || (num1%100==0 && num1%400 !=0) || num1%4 ==0 ) {
		    		System.out.printf("%d년 %d월의 마지막 일자는 29일 입니다",num1,num2);
		    	}else {
		    		System.out.printf("%d년 %d월의 마지막 일자는 28일 입니다",num1,num2);
		    	}
			}
		*/
		}
	}


