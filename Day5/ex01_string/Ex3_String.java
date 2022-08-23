package ex01_string;

public class Ex3_String {
	public static void main(String[] args) {
		
		String str = "Af9-0q23hrakbuds.iabf";
		String str2 = str.replace("a", " ");
		System.out.println(str.length() - str2.length());
		System.out.println("-----------------------");
		
		int a = 0;
		for (int i= 0; i< str.length();i++) {
			if(str.charAt(i) == 'a') {
				a++;
			}
		}
		System.out.println(a);
		System.out.println("-----------------------");
	
		
		// 이메일의 @앞글자가 6이하이거나 10이상인 경우, 잘못된 이메일 출력
		// 그렇지 않을 경우 aabbcc님 환영합니다 출력
		
		String email = "abc@n.com";
		String[] s = email.split("@");
		
		if(s[0].length() <= 6 || s[0].length() >= 10) {
			System.out.println("잘못된 이메일 형식입니다");
		}else {
			System.out.println(s[0] + "님 환영합니다");
		}
		System.out.println("------------------------");
		
		
		// 3~5월은 봄, 6~8월은 여름, 9~11월은 가을, 12~2월은 겨울이라고 출력하자
		String day = "20220823";
		String month = day.substring(4, 6);
		int n = Integer.parseInt(month);
		
		if (n >= 3 || n <= 5) {
			System.out.println("봄");
		}else if( n >= 6 || n <= 8) {
			System.out.println("여름");
		}else if( n >= 9 || n <= 11) {	
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		System.out.println("------------------------");
		
		
		// ori변수의 값이 회문인지 판단하시오
		String ori = "abba";
		String r_ori = "";
		
		for (int i = ori.length()-1; i >= 0; i--) {		// 뒤집어서 r_ori에 저장
			r_ori += ori.charAt(i);
		}
		
		if (r_ori.equals(ori)) {
			System.out.println("회문입니다");
		}else {
			System.out.println("회문이 아닙니다");
		}
		
		
		
	}//main
}
