package chap04;

public class Ex8 {

	public static void main(String[] args) {
	 
		int total = 0;
		int i =0;
		
		for(i=1; i<=100; i +=2) {
			total += i;
		}
		
		System.out.println(total);
		
		
		// 1부터 100사이의 모든 홀수의 값을 더하여 그 결과를 출력하는 코드를 작성하세요.
		//==1 을 하면 실수값을 적어야하니 !=로 정수를 쓰자...
		/*
		int total = 0;
		double i =0;
		
		for(i=1; i<=100; i++) {
			if(i%2 != 0) {
				total += i;
			}
			
		}
		
			System.out.println("1부터 100사이의 홀수의 합수는: "+total);
			*/
	}
	

}
