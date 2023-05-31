package chap04;

public class Ex19 {

	public static void main(String[] args) {
		
		int total = 0,i=1; 
		
		while(total <= 1000) {
			  
			total += i;
			
			if(total > 1000) {
				continue;
			}
			i++;
		}
		
		System.out.printf("1부터 %d까지의 합 %d 로 최초로 1000을 초과하는 값 입니다.",i,total);

	}

}
