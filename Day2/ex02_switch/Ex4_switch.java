package ex02_switch;

public class Ex4_switch {
	public static void main(String[] args) {
		// switch���� ����Ͽ� month�� �ش��ϴ� ���� ���ϱ��� �ִ����� ���
		// 4���� 30�ϱ��� �ֽ��ϴ�
		
		int month = 4;
		switch(month) {
		case 1:	case 3:	case 5:
		case 7:	case 8:	case 10:
		case 12:					// 31�ϱ��� �����ϴ� �޵鸸 ��Ƽ� �ϳ��� break�� ó��
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		
		case 4:	case 6:
		case 9:	case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
			
		case 2:
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�");
			break;
			
		default:
			System.out.println("1~12�� ���� �Է��ϼ���");
			break;
			
		}//switch
		
	}
}
