package chap04;

public class Ex9 {

	public static void main(String[] args) {
		
		//1부터 100사이의 값 중 홀수의 합과 짝수의 합을 동시에 구하여 그 결과를 출력하는 코드를 작성하세요.
		//for안에 조건 여러개 넣기
		
		int eventotal = 0;
		int oddtotal =0;
		int i =0;
		
		for(int even=2, odd=1; even<=100 && odd<=100; even +=2, odd+=2) {
			eventotal += even;
			oddtotal += odd;
		}
		
		System.out.println("홀수의 합: "+oddtotal+", 짝수의 합: "+eventotal);
	
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
