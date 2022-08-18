package ex03_formatter;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + " + "+ n2 + " = "+ (n1+n2)); 	//10 + 20 = 30
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);		//10 + 20 = 30
		
		// ���� 25���̰� Ű�� 170cm�Դϴ�
		System.out.printf("���� %d���̰� Ű�� %dcm�Դϴ�\n", 25, 170);
		
		// 2022.08.18
		// 2022/08/18
		// 2022-08-08
		int year = 2022;
		int month = 8;
		int day = 8;
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		// ���� A���Դϴ�
		char m_class = 'A';
		System.out.printf("���� %c���Դϴ�\n", m_class);
		
		// ���� 25���̰� B���Դϴ�
		System.out.printf("���� %d���̰� %c���Դϴ�\n", 25, 'B');
		
		// ���� true�̰�, ������ false�Դϴ�
		System.out.printf("���� %b�̰�, ������ %b�Դϴ�\n", true, false);
		
		// ������ ����� 30.7���Դϴ�
		System.out.printf("������ ����� %.1f���Դϴ�\n", 30.7);
		
		// ������ ����� 30.5���̸�, ������ 40%�Դϴ�
		System.out.printf("������ ����� %.1f���̸�, ������ %d%%�Դϴ�\n", 30.5, 40);
		
		// ���� �̸��� ȫ�浿�̰� ���̿� �����ϰ� �־��
		System.out.printf("���� �̸��� %s�̰� %s�� �����ϰ� �־��\n", "ȫ�浿","����");
		System.out.printf("���� %s�̰� ���̴� %s�̸�, Ű�� %s�̴�", "ȫ�浿", 23, 178.4);
		
		// %d: ����
		// %c: ����
		// %b: ��
		// %f: �Ǽ�
		// %%: %����
		// %s: ���ڿ�
		
	}//main
}
