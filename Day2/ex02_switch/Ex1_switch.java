package ex02_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		// switch문: 조건값과 비교값을 통해 원하는 결과를 실행하기 위한 제어문
		// switch(비교값) {
		// 	case 조건값:
		//	비교값과 조건값이 일치하는 경우 실행되는 영역
		//	break;
		// }
		
		// switch -> 노가다지만 빠름
		
		int n = 4;
		
		switch(n) { // 비교값
		case 1: // 조건값 -> 절대로 중복불가
			System.out.println("1. 게임시작");
			break;	// 해당 switch문을 완전히 빠져나간다
			
		case 2:
			System.out.println("2. 게임소개");
			break;
			
		case 3:
			System.out.println("3. 게임설정");
			break;
			
		default:	
			// 비교값과 조건값이 하나도 일치하지 않을 때 호출되는 영역
			System.out.println("1~3까지만 입력하세요");
			break;

		}//switch
		
	}//main
}
