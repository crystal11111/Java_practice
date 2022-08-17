package ex03_casting;

public class Ex5_demotion {
	public static void main(String[] args) {
		
		// Casting
		// 2) demotion casting: 작은 자료형에 큰 자료형이 대입되는 것(자동 X)
		char c = 'D';
		int n = c+1;
		c = (char)n;
		System.out.println(c);
		
		n = 2000000000;
		c = (char)n;
		System.out.println(c);
		
	}
}
