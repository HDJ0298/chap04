package chap04;

import java.util.Scanner;
/*
 	�Ʒ��� ���������� �ڵ带 �̿��Ͽ� ����ڰ� ���Ҷ� ���� ���������� ������ �����ϴ� �ڵ带 �ۼ��ϼ���.
 */
public class Exam7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user, com;
		boolean isWin = false;
		String userStr = "",comStr ="", result="", run="";
		String intro ="\n\t[���������� ����]\n"
				+ "\n"
				+ "\t1.����\n"
				+ "\t2.����\n"
				+ "\t3. ��\n"
				+ "\n\t�Է��ϼ���:";
		
		while(true) {
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
			case 1: case -2: result= "�̰���ϴ�"; break;
			case -1: case 2: result= "�����ϴ�"; break;
			}
			
			
			
			System.out.printf("\n\t�����: %s , ��ǻ��: %s \n",userStr,comStr);
			System.out.println("\t������ ����� "+result);
			
			sc.nextLine();
			System.out.print("\n\t����Ͻðڽ��ϱ�? ���Ḧ ���Ͻø� Q,q: ");
			run = sc.nextLine();
			
			if(run.length()==1 && (run.charAt(0) =='q' || run.charAt(0) =='Q' || run.charAt(0) =='��')) {
				break;
				
			}
			
			
		}
		
			System.out.println("\t�����մϴ�");
	}

} 
