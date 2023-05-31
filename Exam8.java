package chap04;

//1부터 100사이의 모든 소수를 아래와 같이 출력하는 코드를 작성하세요.
/*
 * [실행예]
 * 2 3 5 7 11
 * 13 17 19 23 29
 * 
 * 약수의 존재 여부
 * */


public class Exam8 {

	public static void main(String[] args) {
		/*
		 * step1.: 1과 자신을 제외한 20의 모든 약수를 출력하세요.
		
		
		for(int i=2; i<=20/2; i++) {
			if(20%i == 0) {
				System.out.print(i+"  ");
			}
		}
		 */
		/*
		 step2. 2부터 20까지의 모든 수에 대하여 1과 자신을 제외한 약수를 구하여 출력하세요.
		 * */
		/*
		for(int i=2; i<=20; i++) {
			System.out.printf("%2d의 약수: ",i);
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //약수가 있음
					System.out.printf(j+"  ");
				}
				
			}
			System.out.println();
		}
		*/
		
		/*
		 * step3 1부터 100까지의 소수를 구하세요.
		 */
		/*
		boolean isPrime;
		
		for(int i=2; i<=100; i++) {
			
			isPrime =true;  //플래그 함수? 넣기
		
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //약수가 있음
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
		 * step4. 1부터 100까지의 소수를 구하세요. 한줄에5개 출력
		 */
		boolean isPrime;
		int count=0;
		
		for(int i=2; i<=100; i++) {
			
			isPrime =true;  //플래그 함수? 넣기
		
			for(int j=2; j<=i/2; j++) {
				if(i%j ==0) {  //약수가 있음
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


