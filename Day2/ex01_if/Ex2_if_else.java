package ex01_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		// if(조건식) {
		//	조건식이 참일 때 실행되는 영역
		// }else{
		//	조건식이 거짓일 때 실행되는 영역
		// }
		
		int n = 51;
		String str = "";
		if (n==50) {
			str = "50입니다";
		} else {
			str = "50이 아닙니다";
		}
		System.out.println(str);
		
		
		char gen = '남';
		str = "";
		if (gen == '여') {
			str = "여자입니다";
		} else {
			str = "남자입니다";
		}
		System.out.println(str);
		
		// 위의 남녀를 구별하는 코드를 삼항연산자로 작성
		String res = (gen == '여') ? "여자입니다": "남자입니다";		// str = gen == '여' ? "여자입니다": "남자입니다";
		System.out.println(res);
		
		
	}
}
