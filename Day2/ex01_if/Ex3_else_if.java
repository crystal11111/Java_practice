package ex01_if;

public class Ex3_else_if {
	public static void main(String[] args) {
		// else if문: 조건식이 여러개 필요한 경우
		
		// if (조건식1){
		//	조건식1이 참일때 실행되는 영역
		// } else if {
		//	조건식2가 참일때 실행되는 영역
		// } else {
		//	모든 조건이 거짓일때 반드시 실행되는 영역
		// }
		
		int num = 62;
		String str = "";
		
		if (num >= 90) {
			str = "A";
		}else if (num >= 80) {
			str = "B";
		}else if (num >= 70) {
			str = "C";
		}else if (num >= 60) {
			str = "D";
		}else {
			str = "F";
		}
		
		System.out.println(str);
		
	}
}
