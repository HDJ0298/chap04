package chap04;

public class Ex13 {

	public static void main(String[] args) {

		int total=0;
		
		
		/*
		for(int i=1; i<=100; i++) {
			total += i;
		}
		//for를 while로 바꾸기
		int i=1 를 여기로
		for을 while로 바꾸기(int i=1; i<=100; i++) {
			total += i;
			i++ 을 여기로
		}
		
		*/
		int i=1;
		do {
			total += i;
			i++;
		}
		while( i<=100);
		System.out.println("1부터 100까지의 합: "+total);

	}

}
