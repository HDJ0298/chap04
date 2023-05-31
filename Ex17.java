package chap04;

public class Ex17 {

	public static void main(String[] args) {
		int total = 0,i = 1;
		
		/*
		
		int i = 1;
		while (true) {
			total += i;  //무한반복이라서 if조건문 넣어주기
			
			if(total >1000) {
				break;
			}
			
			i++; 
		}
		
		*/
		
	 for(;; i++) {   //증감식만 있게 만들기
		 
		 total += i;  //무한반복이라서 if조건문 넣어주기
			
			if(total >1000) {
				break;
			}
	 }
		
		
			System.out.printf("1부터 %d까지의 합은 %d 입니다",i,total);
			
			
	}

}
