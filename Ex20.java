package chap04;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		
		System.out.print("문자열을 입력하세요: ");
		//input = sc.next();
		input = sc.nextLine();
		sc.close();
		
		System.out.println();
		
		for(int i = 0; i<input.length(); i++) {    //length = 문자열을 구성하는 문자의 수
			System.out.println(input.charAt(i));  //한자씩 띄우는거?
		}

	}

}
