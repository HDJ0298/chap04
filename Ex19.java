package chap04;

public class Ex19 {

	public static void main(String[] args) {
		
		int total = 0,i=1; 
		
		while(total <= 1000) {
			  
			total += i;
			
			if(total > 1000) {
				continue;
			}
			i++;
		}
		
		System.out.printf("1���� %d������ �� %d �� ���ʷ� 1000�� �ʰ��ϴ� �� �Դϴ�.",i,total);

	}

}
