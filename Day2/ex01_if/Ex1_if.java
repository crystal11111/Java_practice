package ex01_if;

public class Ex1_if {
	public static void main(String[] args) {
		//���: ���α׷��� �帧�� �����ϴ� ����
		//�б⹮: if, switch
		//�ݺ���: for, while
		
		// if(���ǽ�){
		// 	���ǽ��� ���϶� �����ϴ� ����
		// }
	
		int n = 51;
		String str = "";
		
		if (n==50) {
			str = "50�Դϴ�";
		}
		
		if (n!=50) {
			str = "50�� �ƴմϴ�";
		}
		
		System.out.println(str);
		
		
		char gender = '��';
		
		if (gender == '��') {
			System.out.println("�����Դϴ�.");
		}
		if (gender == '��') {
			System.out.println("�����Դϴ�.");
		}
		
	}
}
