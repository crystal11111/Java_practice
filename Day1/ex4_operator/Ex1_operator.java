package ex4_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		// Operator
		// 1) �ְ�����: ., ()
		// 2) ����������: ++, --
		// 3) ���������: +, -, *, /, %
		// 4) ����Ʈ������: >>, <<
		// 5) ��Ʈ������: &, |, ^
		// 6) �񱳿�����: <, >, >=, <=, ==, !=
		// 7) ��������: &&, ||, !
		// 8) ����(����)������: ?, ,, :
		// 9) ���Կ�����: =, *=, /=, %=, +=, -=
		
		// ���������: 4Ģ����� ������ �����ڸ� �������ִ�
		int i1 = 20;
		int i2 = 7;
		int i3 = i1 + i2;
		System.out.println(i3);
		
		i3 = i1 / i2;	// ��
		System.out.println(i3);
		
		i3 = i1 % i2;	// ������
		System.out.println(i3);
	
		float f = i1 / i2;
		System.out.println(f);
		
		System.out.println("--------------------------");
		
		
		// ���Կ�����: Ư������ ������ �����Ͽ� ����Ű�� ������
		int n1 = 10;
		int n2 = 7;
		n1 += n2;
		System.out.println(n1);
		n1 -= 2;
		System.out.println(n1);
		n1 /= n2;
		System.out.println(n1);
		n2 %= n1;
		System.out.println(n2);
		
		System.out.println("--------------------------");
		
		
		// �񱳿�����: ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		int a1 = 10;
		int a2 = 20;
		boolean res = a1 < a2;
		System.out.println("res = a1 < a2 " +res);
		
		res = a1 == a2;
		System.out.println("res = a1 == a2 "+res);
		
		res = a1 != a2;
		System.out.println("res = a1 != a2 "+res);
		
		System.out.println("--------------------------");
		
		
		// ����������: 1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������, ���������� ���������� �������� ������ �� �˾ƾ��Ѵ�
		int a = 10;
		System.out.println("a: "+ ++a);	// ��������
		
		int b = 10;
		System.out.println("b: "+ b++);	// ��������
		System.out.println(b); 		// ���� ������ ����� �� ����
		b++;
		b--;
		++b;	//12
		b--;	//12
		--b;	//10
		++b;	//11
		b++;	//11
		--b;	//11
		b++;	//11
		System.out.println(b--);	//12
		// ���������ڴ� ������ 1���� ���� �����ϱ⶧����
		// 2�̻��� ���� �����ϰ� �ʹٸ� ���Կ����ڸ� ������ ����!
		b += 2;
		
		
		
		
	}
}
