package ex01_if;

public class Ex1_if {
	public static void main(String[] args) {
		//제어문: 프로그램의 흐름을 제어하는 문장
		//분기문: if, switch
		//반복문: for, while
		
		// if(조건식){
		// 	조건식이 참일때 동작하는 영역
		// }
	
		int n = 51;
		String str = "";
		
		if (n==50) {
			str = "50입니다";
		}
		
		if (n!=50) {
			str = "50이 아닙니다";
		}
		
		System.out.println(str);
		
		
		char gender = '여';
		
		if (gender == '여') {
			System.out.println("여자입니다.");
		}
		if (gender == '남') {
			System.out.println("남자입니다.");
		}
		
	}
}
