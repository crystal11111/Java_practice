package ex02_value_type;

public class Ex2_valueType {
	public static void main(String[] args) {	// main + ctrl + spacebar ���� �ڵ��ϼ�
		// �⺻�ڷ���
		/*
		 	����: boolean ..... 1bit 
		 	������: char ........ 2byte 
		 	������: byte ........ 1byte	-> -120 ~ 127
		 		  short ....... 2byte	- ũ�Ⱑ �ָ��� �����������	-> -32768 ~ 32767
		 		  int ......... 4byte	-> -21�� ~ 21��
		 		  long ........ 8byte 	-> -900�� ~ 900��		�ֽĽ��� ���Ͻô� ����� �ַ� ���
		 	�Ǽ���: float ....... 4.?byte
		 		  double ...... 8.?byte	
		 */
		
		// ����: Ư�� ���� ����Ű�� ���� ���
		// ���� �̸� ������ ������
		// 1) _�� �����ϰ� Ư�����ڸ� ����� �� ����.
		// 2) ���ڷ� ���۵Ǵ� �̸��� ���� �� ����.
		// 3) �ҹ��ڷ� �����ϵ�, �ѱ۵��� ������� �ʴ´�.
		
		// ���������� ��Ģ
		// 1) �ڷ��� ������; (����)	int a;
		// 2) ������ = ��; (����)	a = 10;
		// 3) �ڷ��� ������ = ��; (����� ������ ���ÿ�: �ʱ�ȭ)
		
		// ����(boolean)
		// true, false�� �ΰ��� ������ ������ �� �ִ� �ڷ��� Ÿ��
		boolean b = true;
		b = false;
		System.out.println("b : "+ b);
		
		// ������(character)
		// Ȧ����ǥ �ȿ� �� �ѱ��ڸ� ���� ������ �ڷ���
		char c = 'A';
		System.out.println("c : "+ c);
		
		c = 'B';
		System.out.println("c : "+ c);
		
		c = 67 + 1;		// �ƽ�Ű�ڵ� 68�� �ش��ϴ� 'D'���ڰ� ����
		System.out.println("c : "+ c);
	}
}
