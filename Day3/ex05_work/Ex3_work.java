package ex05_work;

public class Ex3_work {
	public static void main(String[] args) {
		// 4는 소수가 아닙니다
		
		int n = 3;
		int i = 0;
		
		for (i=2; i<=n; i++) {
			
			if(n % i == 0) {
				break;
			}
			
		}//for
		
		if (i ==n) {
			System.out.println(n + "은(는) 소수입니다");
		}else {
			System.out.println(n + "은(는) 소수가");
		}
		
	
	}//main
		
}
