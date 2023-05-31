package chap04;

import java.util.Scanner;
/*
 1.가위
 2.바위
 3. 보
 입력하세요:   3
 
 사용자 보, 컴퓨터 가위
 가위바위보 결과 -- 졌습니다.
 
 [코드 작성 조건]
 1.switch문 이용하여 문제를 해결하세요.
 2.if문을 이용하여 문제를 해결하세요.
 */
public class Exam5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user, com;
		String userStr = "",comStr ="", result="";
		String intro ="\n\t[가위바위보 게임]\n"
				+ "\n"
				+ "\t1.가위\n"
				+ "\t2.바위\n"
				+ "\t3. 보\n"
				+ "\n\t입력하세요:";
		
		com = (int)(Math.random()*3);
		
		System.out.print(intro);
		user = sc.nextInt()-1;  //제로베이스위해서 사용자입력을 0부터시작하게함
		
		sc.close();
		
		switch(user) {
		case 0: userStr = "가위"; break;
		case 1: userStr = "바위"; break;
		case 2: userStr = "보"; break;
		}
		
		switch(com) {
		case 0: comStr = "가위"; break;
		case 1: comStr = "바위"; break;
		case 2: comStr = "보"; break;
		}
		
		switch(user-com) {
		case 0: result= "비겼습니다"; break;
		case 1: case -2: result= "이겼습니다"; break;
		case -1: case 2: result= "졌습니다"; break;
		}
		
		System.out.printf("\n\t사용자: %s , 컴퓨터: %s \n",userStr,comStr);
		System.out.println("\t게임의 결과는 "+result);
					

	}

}
