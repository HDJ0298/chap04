package chap04;

import java.util.Scanner;
/*
 	�Ʒ��� ���������� �ڵ带 �̿��Ͽ� �̱� ������ ���������� ������ �����ϴ� �ڵ带 �ۼ��ϼ���.
 */
public class Exam6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user, com;
		boolean isWin = false;  //�÷��� ����?
		String userStr = "",comStr ="", result="";
		String intro ="\n\t[���������� ����]\n"
				+ "\n"
				+ "\t1.����\n"
				+ "\t2.����\n"
				+ "\t3. ��\n"
				+ "\n\t�Է��ϼ���:";
		
		
		do {
			
			com = (int)(Math.random()*3);
			
			System.out.print(intro);
			user = sc.nextInt()-1;  //���κ��̽����ؼ� ������Է��� 0���ͽ����ϰ���
			
			
			switch(user) {
			case 0: userStr = "����"; break;
			case 1: userStr = "����"; break;
			case 2: userStr = "��"; break;
			}
			
			switch(com) {
			case 0: comStr = "����"; break;
			case 1: comStr = "����"; break;
			case 2: comStr = "��"; break;
			}
			
			switch(user-com) {
			case 0: result= "�����ϴ�"; break;
			case 1: case -2: result= "�̰���ϴ�"; isWin=true; break;
			case -1: case 2: result= "�����ϴ�"; break;
			}
			
			
			
			System.out.printf("\n\t�����: %s , ��ǻ��: %s \n",userStr,comStr);
			System.out.println("\t������ ����� "+result);
			
		}while(!isWin);
		
		sc.close();
		System.out.println("\n�̿����ּż� �����մϴ�~~!\n");
		
	}

}
