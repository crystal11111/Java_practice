package ex04_work;

public class Ex1_work {
	public static void main(String[] args) {
		// �⺻�ڷ����� �����ڸ� ����� ����
		/*
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ� �� ������ �Ϸ� ���귮��
		 5, 7, 5��
		 ���������� �Ϸ翡 ����Ǵ� ������ �� ������ ����ϰ�
		 �ð��� ��� ���갹���� �Ҽ��� 2�ڸ������� ���.
		 (��, ������ ������ �Ϸ���귮�� �����ϴ� ������ int,
		 �ð� �� ����� �����ϴ� ������ float���� ����ÿ�)
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int total = pear + apple + orange;
		System.out.println(total);
		
		float h_total = (float)total/24;
		System.out.printf("%.2f",h_total);
		
		
	}//main
}
