package chap04;

public class Ex13 {

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
		do {
			total += i;
			i++;
		}
		while( i<=100);
		System.out.println("1���� 100������ ��: "+total);

	}

}
