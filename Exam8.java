package chap04;

//1���� 100������ ��� �Ҽ��� �Ʒ��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
/*
 * [���࿹]
 * 2 3 5 7 11
 * 13 17 19 23 29
 * 
 * ����� ���� ����
 * */


public class Exam8 {

	public static void main(String[] args) {
		/*
		 * step1.: 1�� �ڽ��� ������ 20�� ��� ����� ����ϼ���.
		
		
		for(int i=2; i<=20/2; i++) {
			if(20%i == 0) {
				System.out.print(i+"  ");
			}
		}
		 */
		/*
		 step2. 2���� 20������ ��� ���� ���Ͽ� 1�� �ڽ��� ������ ����� ���Ͽ� ����ϼ���.
		 * */
		/*
		for(int i=2; i<=20; i++) {
			System.out.printf("%2d�� ���: ",i);
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //����� ����
					System.out.printf(j+"  ");
				}
				
			}
			System.out.println();
		}
		*/
		
		/*
		 * step3 1���� 100������ �Ҽ��� ���ϼ���.
		 */
		/*
		boolean isPrime;
		
		for(int i=2; i<=100; i++) {
			
			isPrime =true;  //�÷��� �Լ�? �ֱ�
		
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //����� ����
					isPrime=false;
					break;	
				}
				
			}
			if(isPrime) {
				System.out.printf(i+"  ");
			}
		}
		*/
		
		/*
		 * step4. 1���� 100������ �Ҽ��� ���ϼ���. ���ٿ�5�� ���
		 */
		boolean isPrime;
		int count=0;
		
		for(int i=2; i<=100; i++) {
			
			isPrime =true;  //�÷��� �Լ�? �ֱ�
		
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //����� ����
					isPrime=false;
					break;	
				}
				
			}
			if(isPrime) {
				count++;
				System.out.printf("%3d   ",i);
					if(count % 5 ==0) {
					System.out.println();
						}
				
				}
		}
		
		
		
	}

}


