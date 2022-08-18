package ex02_switch;

public class Ex4_switch {
	public static void main(String[] args) {
		// switch문을 사용하여 month에 해당하는 달이 몇일까지 있는지를 출력
		// 4월은 30일까지 있습니다
		
		int month = 4;
		switch(month) {
		case 1:	case 3:	case 5:
		case 7:	case 8:	case 10:
		case 12:					// 31일까지 존재하는 달들만 모아서 하나의 break로 처리
			System.out.println(month + "월은 31일까지 있습니다");
			break;
		
		case 4:	case 6:
		case 9:	case 11:
			System.out.println(month + "월은 30일까지 있습니다");
			break;
			
		case 2:
			System.out.println("2월은 28일까지 있습니다");
			break;
			
		default:
			System.out.println("1~12의 값을 입력하세요");
			break;
			
		}//switch
		
	}
}
