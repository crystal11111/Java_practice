package ex03_casting;

public class Ex4_promotion {
	public static void main(String[] args) {
		
		// Casting(����ȯ)
		// 1) promotion casting: ū �ڷ����� ���� �ڷ����� ���ԵǴ°�(�ڵ�)
		double d = 100.5;	// 8byte
		int n = 200;		// 4byte
		d = n;
		System.out.println(d);
		
		char c = 'A';	// 2byte
		int i = 200;	// 4byte
		i = c;
		System.out.println(i); 		// �ƽ�Ű�ڵ�� ��ȯ��
		
		
	}
}
