package chap04;

public class Ex11 {

	public static void main(String[] args) {
		
		int total=0;
		
		
		/*
		for(int i=1; i<=100; i++) {
			total += i;
		}
		//for�� while�� �ٲٱ�
		int i=1 �� �����
		for�� while�� �ٲٱ�(int i=1; i<=100; i++) {
			total += i;
			i++ �� �����
		}
		
		*/
		int i=1;
		while( i<=100) {
			total += i;
			i++;
		}
		System.out.println("1���� 100������ ��: "+total);

	}

}
