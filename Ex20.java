package chap04;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		//input = sc.next();
		input = sc.nextLine();
		sc.close();
		
		System.out.println();
		
		for(int i = 0; i<input.length(); i++) {    //length = ���ڿ��� �����ϴ� ������ ��
			System.out.println(input.charAt(i));  //���ھ� ���°�?
		}

	}

}
