package chap04;


public class Ex18 {

	public static void main(String[] args) {
		//1���� 100������ ¦���� ���� ���ϴ� �ڵ带 �ۼ��ϼ���.
		// ��  continue �� ����մϴ�.
		
		/*
		int total = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%2 != 0) {   //Ȧ���� continue �ؼ� ������
				continue;
			}
		
			total +=i;
		}
			System.out.println("total: "+total);
			*/
		
		
		//for �ݺ����� while�ݺ������� �ٲٱ�
		
		int total = 0;
		
		int i=1;
		while(i<=100) {
			
			if(i%2 != 0) {   //Ȧ���� continue �ؼ� ������
				i++;         //i�� ����
				continue;    // while ���� continue ����ҷ��� ���������� �ڵ带 continue ���� �־����
				}
			
				total +=i;
				i++;
				
			}
		System.out.println("total: "+total);
	}

}
