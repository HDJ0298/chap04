package chap04;

public class Ex8 {

	public static void main(String[] args) {
	 
		int total = 0;
		int i =0;
		
		for(i=1; i<=100; i +=2) {
			total += i;
		}
		
		System.out.println(total);
		
		
		// 1���� 100������ ��� Ȧ���� ���� ���Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		//==1 �� �ϸ� �Ǽ����� ������ϴ� !=�� ������ ����...
		/*
		int total = 0;
		double i =0;
		
		for(i=1; i<=100; i++) {
			if(i%2 != 0) {
				total += i;
			}
			
		}
		
			System.out.println("1���� 100������ Ȧ���� �ռ���: "+total);
			*/
	}
	

}
