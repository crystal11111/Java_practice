package ex03_casting;

public class Ex5_demotion {
	public static void main(String[] args) {
		
		// Casting
		// 2) demotion casting: ���� �ڷ����� ū �ڷ����� ���ԵǴ� ��(�ڵ� X)
		char c = 'D';
		int n = c+1;
		c = (char)n;
		System.out.println(c);
		
		n = 2000000000;
		c = (char)n;
		System.out.println(c);
		
	}
}
