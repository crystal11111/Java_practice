package ex03_formatter;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		System.out.println(n1 + " + "+ n2 + " = "+ (n1+n2)); 	//10 + 20 = 30
		System.out.printf("%d + %d = %d\n", n1, n2, n1+n2);		//10 + 20 = 30
		
		// 저는 25세이고 키는 170cm입니다
		System.out.printf("저는 %d세이고 키는 %dcm입니다\n", 25, 170);
		
		// 2022.08.18
		// 2022/08/18
		// 2022-08-08
		int year = 2022;
		int month = 8;
		int day = 8;
		System.out.printf("%d-%02d-%02d\n", year, month, day);
		
		// 저는 A반입니다
		char m_class = 'A';
		System.out.printf("저는 %c반입니다\n", m_class);
		
		// 저는 25세이고 B형입니다
		System.out.printf("저는 %d세이고 %c형입니다\n", 25, 'B');
		
		// 참은 true이고, 거짓은 false입니다
		System.out.printf("참은 %b이고, 거짓은 %b입니다\n", true, false);
		
		// 오늘의 기온은 30.7도입니다
		System.out.printf("오늘의 기온은 %.1f도입니다\n", 30.7);
		
		// 오늘의 기온은 30.5도이며, 습도는 40%입니다
		System.out.printf("오늘의 기온은 %.1f도이며, 습도는 %d%%입니다\n", 30.5, 40);
		
		// 저는 이름은 홍길동이고 신촌에 거주하고 있어요
		System.out.printf("저의 이름은 %s이고 %s에 거주하고 있어요\n", "홍길동","신촌");
		System.out.printf("나는 %s이고 나이는 %s이며, 키는 %s이다", "홍길동", 23, 178.4);
		
		// %d: 정수
		// %c: 문자
		// %b: 논리
		// %f: 실수
		// %%: %문자
		// %s: 문자열
		
	}//main
}
