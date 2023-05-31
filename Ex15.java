package chap04;

public class Ex15 {

	public static void main(String[] args) {
		// 1부터 100까지의 합은 5050입니다. 그렇다면 1부터 몇까지의 합이 최초로 1000을 초과하는 값일까요
		// 그결과를 계산하여 출력하는 코드를 작성하세요.
		// for do dowhile 아무꺼나 사용하기
		
		//45인줄 알았는데 46이 나온다..? 잘못나온값임
		
		int total = 0,i=0; 
		
	/*
		for( i=0; i<=45; i++) {    //이건 그냥 조건 46번 반복임
			total += i;
		}
		System.out.printf("1부터 %d까지의 합 %d 로 최초로 1000을 초과하는 값 입니다.",i,total);
		
			
		*/
		while(total <= 1000) {
			i++;  //45에서 1000이 넘었는데 계산이끝나고 ++이 들어가서 print에서 마지막++이 된 46이 나오는거임. i++를 위에 넣어주기.
			total += i;
			
		}
		
		System.out.printf("1부터 %d까지의 합 %d 로 최초로 1000을 초과하는 값 입니다.",i,total);
		
		
		/*
		
		for(int i=1; i<=100; i++) {
			
			if(total >=1000) {
				System.out.printf("1부터 %d까지의 합이 최초로 1000을 초과하는 값 입니다.",i);
			}
		}
		
*/
	}

}
