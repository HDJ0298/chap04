package chap04;

public class Ex17 {

	public static void main(String[] args) {
		int total = 0,i = 1;
		
		/*
		
		int i = 1;
		while (true) {
			total += i;  //���ѹݺ��̶� if���ǹ� �־��ֱ�
			
			if(total >1000) {
				break;
			}
			
			i++; 
		}
		
		*/
		
	 for(;; i++) {   //�����ĸ� �ְ� �����
		 
		 total += i;  //���ѹݺ��̶� if���ǹ� �־��ֱ�
			
			if(total >1000) {
				break;
			}
	 }
		
		
			System.out.printf("1���� %d������ ���� %d �Դϴ�",i,total);
			
			
	}

}
