package ex02_value_type;

public class Ex3_valueType {
	public static void main(String[] args) {
		
		// ������: �Ҽ����� ���� �ڿ����� �����ϴ� �ڷ���
		// byte b = 128;	// byte�� ���� �� �ִ� ǥ�������� ��� ���� �־����Ƿ� ���� �߻�
		int n = 210000000;
		long lo = 2200000000L;	// int�� ������ �Ѱ��� �� L������
		
		System.out.println("n: "+ n);
		System.out.println("lo: "+ lo);
	
		
		// �Ǽ���: �Ҽ����� ���� ���� �����ϱ����� �ڷ���
		float f = 3.14F;
		double d = 3.14;
		f = 100;
		d = 100;
		
		System.out.println("f: "+f);
		System.out.println("d: "+d);
		
		
	}
}
