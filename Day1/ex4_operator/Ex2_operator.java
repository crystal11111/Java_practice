package ex4_operator;

public class Ex2_operator {
	public static void main(String[] args) {
				
		// ��������: �񱳿����ڸ� ���� ������ �ΰ� �̻� �ʿ��Ҷ� ���
		int age = 30;
		int limit = 35;

		// and(&&)������: ���� ������ ������ ��� ������ ������ �������� �ʴ´�.
		// �� && �� = ��
		// �� && ���� = ����
		// ���� && �� = ����
		// ���� && ���� = ����
		boolean res = limit - age > 5 && ++age >= 30;
		System.out.println(res);
		System.out.println(age);
		
		
		// or(||)������: ���� ������ ���̸� ���� ������ �������� �ʴ´�.
		// �� || �� = ��
		// �� || ���� = ��
		// ���� || �� = ��
		// ���� || ���� = ����
		int n1 = 10;
		int n2 = 20;
		res = n2 - 10 == 11 || (n1 += 10) > 20;
		System.out.println(res);
		System.out.println(n1);
		
		
		// not(!)������: !�� ���� ���� ��������, ������ ������ ����
		boolean b = true;
		System.out.println(!b);		// ���������� �������� ����
		System.out.println(b);		
		
		System.out.println("----------------------");
		
		
		// ����(����)������
		// �ϳ��� ���ǽ��� �ְ� �� ������ ���϶��� �����϶��� ��� Ŀ���ϴ� ����� ���� ���� ������
		int a1 = 10;
		int a2 = 15;
		boolean res2 = ++a1 >= a2-10 ? true : false;
		System.out.println(res2);
		
		int i1 = 10;
		int i2 = 20;
		char res3 = (i1 += i1) == i2 ? 'y' :'n';
		System.out.println(res3);
		
		System.out.println("----------------------");
		
		int aa = 10;
		int bb = 12;
		res = ++aa >= bb || 2 + 7 <= bb && 13 - bb >= 0 && (aa += bb) - (aa % bb) > 12;
			//	11 >= 12 || 9 <= 12 && 1 >= 0 && 23-11 > 12
			//	   false || true && true && false
			//		true && false
			//		= false
		System.out.println(res);
		
	}
}
