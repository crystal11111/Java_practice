package ex03_casting;

public class Ex4_promotion {
	public static void main(String[] args) {
		
		// Casting(형변환)
		// 1) promotion casting: 큰 자료형에 작은 자료형이 대입되는것(자동)
		double d = 100.5;	// 8byte
		int n = 200;		// 4byte
		d = n;
		System.out.println(d);
		
		char c = 'A';	// 2byte
		int i = 200;	// 4byte
		i = c;
		System.out.println(i); 		// 아스키코드로 변환됨
		
		
	}
}
