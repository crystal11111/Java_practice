package ex02_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		// switch��: ���ǰ��� �񱳰��� ���� ���ϴ� ����� �����ϱ� ���� ���
		// switch(�񱳰�) {
		// 	case ���ǰ�:
		//	�񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		//	break;
		// }
		
		// switch -> �밡������ ����
		
		int n = 4;
		
		switch(n) { // �񱳰�
		case 1: // ���ǰ� -> ����� �ߺ��Ұ�
			System.out.println("1. ���ӽ���");
			break;	// �ش� switch���� ������ ����������
			
		case 2:
			System.out.println("2. ���ӼҰ�");
			break;
			
		case 3:
			System.out.println("3. ���Ӽ���");
			break;
			
		default:	
			// �񱳰��� ���ǰ��� �ϳ��� ��ġ���� ���� �� ȣ��Ǵ� ����
			System.out.println("1~3������ �Է��ϼ���");
			break;

		}//switch
		
	}//main
}
