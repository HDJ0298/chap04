package chap04;

public class Ex9 {

	public static void main(String[] args) {
		
		//1���� 100������ �� �� Ȧ���� �հ� ¦���� ���� ���ÿ� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		//for�ȿ� ���� ������ �ֱ�
		
		int eventotal = 0;
		int oddtotal =0;
		int i =0;
		
		for(int even=2, odd=1; even<=100 && odd<=100; even +=2, odd+=2) {
			eventotal += even;
			oddtotal += odd;
		}
		
		System.out.println("Ȧ���� ��: "+oddtotal+", ¦���� ��: "+eventotal);
	
		/*
		int total = 0;
		int total2 =0;
		int i =0;
				
		for(i=1; i<=100; i++) {
			if(i%2 !=0) {
				total +=i;
			}else {
				total2 += i;
			}
		}
		
		*/
		
	}

}
