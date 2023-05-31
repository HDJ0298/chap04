package chap04;

import java.util.Scanner;

/*
  ���� ������ ���� ��� ���α׷� �ۼ��ϱ�
  
  [���� ��1]
  �⵵�� ���� �Է��ϼ���: 2023 1
  2023�� 1���� ������ ���ڴ� 31���Դϴ�.
  
  [���� ��1]
  �⵵�� ���� �Է��ϼ���: 2020 2
  2020�� 2���� ������ ���ڴ� 29���Դϴ�.
  
  [�� ���� ������ ����]
  1. ū��: 1,3,5,7,8,10,12  === 31��
  2. ������: 4,6,9,11 === 30��
  3. 2��: ����-29�� ���-28��
  
 */

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int year,month, monthLastDay=31;
		System.out.printf("�⵵�� ���� �Է��ϼ���: ");
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
		
		System.out.printf("�Է��Ͻ� %d���� %d���� ��������¥�� %d�� �Դϴ�.",year,month,monthLastDay);
		
	
		
		/* �����Ѱ� ��
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.printf("�⵵�� ���� �Է��ϼ���: ");
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
		    	System.out.printf("%d�� %d���� ������ ���ڴ� 31�� �Դϴ�",num1,num2);
		    	break;
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	System.out.printf("%d�� %d���� ������ ���ڴ� 30�� �Դϴ�",num1,num2);
		    	break;
		    case 2:
		    	if(num1%400 == 0 || (num1%100==0 && num1%400 !=0) || num1%4 ==0 ) {
		    		System.out.printf("%d�� %d���� ������ ���ڴ� 29�� �Դϴ�",num1,num2);
		    	}else {
		    		System.out.printf("%d�� %d���� ������ ���ڴ� 28�� �Դϴ�",num1,num2);
		    	}
			}
		*/
		}
	}


