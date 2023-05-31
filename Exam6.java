package chap04;

import java.util.Scanner;
/*
 	아래의 가위바위보 코드를 이용하여 이길 때까지 가위바위보 게임을 구현하는 코드를 작성하세요.
 */
public class Exam6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user, com;
		boolean isWin = false;  //플래그 변수?
		String userStr = "",comStr ="", result="";
		String intro ="\n\t[가위바위보 게임]\n"
				+ "\n"
				+ "\t1.가위\n"
				+ "\t2.바위\n"
				+ "\t3. 보\n"
				+ "\n\t입력하세요:";
		
		
		do {
			
			com = (int)(Math.random()*3);
			
			System.out.print(intro);
			user = sc.nextInt()-1;  //제로베이스위해서 사용자입력을 0부터시작하게함
			
			
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
			case 1: case -2: result= "이겼습니다"; isWin=true; break;
			case -1: case 2: result= "졌습니다"; break;
			}
			
			
			
			System.out.printf("\n\t사용자: %s , 컴퓨터: %s \n",userStr,comStr);
			System.out.println("\t게임의 결과는 "+result);
			
		}while(!isWin);
		
		sc.close();
		System.out.println("\n이용해주셔서 감사합니다~~!\n");
		
	}

}
