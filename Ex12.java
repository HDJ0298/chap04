package chap04;

//아래의 중첩for문을 중첩 while문으로 변경하는 코드를 작성하시오.
/*
for(int i=0; i<=9; i++) {      //0줄부터 9줄까지~  곱하는 수 변경 반복문
	for(int j=2; j<=9; j++) {   //단수 변경 반복문
		if(i==0) {
			System.out.printf("  [%d 단]\t\t",j);
		}else {
			System.out.printf("%d x %d = %d\t",j,i,i*j);
		}
	}
	System.out.println();
*/
	

public class Ex12 {

			public static void main(String[] args) {
		
				int num=0;
				while(num<=9) {
					
					int dan =2;
					
					while(dan<=9) {
						
						if(num==0) {
							System.out.printf("  [%d 단]\t\t",dan);
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
