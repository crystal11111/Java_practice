package ex01_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		// if(���ǽ�) {
		//	���ǽ��� ���� �� ����Ǵ� ����
		// }else{
		//	���ǽ��� ������ �� ����Ǵ� ����
		// }
		
		int n = 51;
		String str = "";
		if (n==50) {
			str = "50�Դϴ�";
		} else {
			str = "50�� �ƴմϴ�";
		}
		System.out.println(str);
		
		
		char gen = '��';
		str = "";
		if (gen == '��') {
			str = "�����Դϴ�";
		} else {
			str = "�����Դϴ�";
		}
		System.out.println(str);
		
		// ���� ���ฦ �����ϴ� �ڵ带 ���׿����ڷ� �ۼ�
		String res = (gen == '��') ? "�����Դϴ�": "�����Դϴ�";		// str = gen == '��' ? "�����Դϴ�": "�����Դϴ�";
		System.out.println(res);
		
		
	}
}
