package chap04;

//��ø do while��
/*
 * for(int i=0; i<=9; i++) {      //0�ٺ��� 9�ٱ���~  ���ϴ� �� ���� �ݺ���
			for(int j=2; j<=9; j++) {   //�ܼ� ���� �ݺ���
				if(i==0) {
					System.out.printf("  [%d ��]\t\t",j);
				}else {
					System.out.printf("%d x %d = %d\t",j,i,i*j);
				}
			}
			System.out.println();
		}
 */

public class Ex14 {

	public static void main(String[] args) {
		
		
		int num=0;
		while(num<=9) {
			
			int dan =2;
			
			while(dan<=9) {
				
				if(num==0) {
					System.out.printf("  [%d ��]\t\t",dan);
				}else {
					System.out.printf("%d x %d = %d\t",dan,num,dan*num);
				}
				dan++;
			}
	
		num++;
		System.out.println();
		
	  }
	}
}
