package ex04_work;

public class Ex2_work {
	public static void main(String[] args) {
		// switch문을 이용한 연습문제
		// 10 * 5 = 50
		int su1 = 10;
		int su2 = 5;
		char ch = '*';
		
		switch(ch) {
		case '+':
			System.out.printf("%d + %d = %d", su1, su2, su1 + su2);
			break;
		
		case '-':
			System.out.printf("%d - %d = %d", su1, su2, su1 - su2);
			break;
			
		case '*':
			System.out.printf("%d * %d = %d", su1, su2, su1 * su2);
			break;
			
		case '/':
			System.out.printf("%d / %d = %d", su1, su2, su1 / su2);
			break;	
		}
		
	}
}
