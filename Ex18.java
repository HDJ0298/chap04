package chap04;


public class Ex18 {

	public static void main(String[] args) {
		//1부터 100사이의 짝수의 합을 구하는 코드를 작성하세요.
		// 단  continue 를 사용합니다.
		
		/*
		int total = 0;
		for(int i=1; i<=100; i++) {
			
			if(i%2 != 0) {   //홀수면 continue 해서 밖으로
				continue;
			}
		
			total +=i;
		}
			System.out.println("total: "+total);
			*/
		
		
		//for 반복문을 while반복문으로 바꾸기
		
		int total = 0;
		
		int i=1;
		while(i<=100) {
			
			if(i%2 != 0) {   //홀수면 continue 해서 밖으로
				i++;         //i값 증감
				continue;    // while 에서 continue 사용할려면 미지수변경 코드를 continue 위에 넣어야함
				}
			
				total +=i;
				i++;
				
			}
		System.out.println("total: "+total);
	}

}
