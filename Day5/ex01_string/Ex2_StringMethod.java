package ex01_string;

public class Ex2_StringMethod {
	public static void main(String[] args) {
		
		//method: 어떤 작업을 수행하기 위한 명령문들의 집합
		String str = "Hong Gil Dong";
		int index = str.length();
		System.out.println("str의 길이: " + index);
		
		index = str.indexOf('i');
		System.out.println("맨앞 i의 위치: " + index);
		
		index = str.indexOf("Dong");
		System.out.println("문장 Dong이 시작하는 위치: " + index);
		
		index = str.lastIndexOf('o');
		System.out.println("마지막 o의 위치: " + index);
		
		char ch = str.charAt(3);
		System.out.println("3번째 위치한 문자: " + ch);
		
		String s1 = str.toUpperCase();
		System.out.println("문장 전체를 대문자로: " + s1);
		
		s1 = str.toLowerCase();
		System.out.println("문장 전체를 소문자로: " + s1);
		
		String s2 = "aabbcc";
		s1= s2.replace('a', '1');
		System.out.println("특정 문자 변경: " + s1);
		
		s2 = "   a123  ";
		s1 = s2.trim();
		System.out.println("문장 앞뒤의 의미없는 공백을 제거: " + s1);
		
		String ss1 = "Apple";
		String ss2 = new String("apple");
		if(ss1.equals(ss2)) {
			System.out.println("ss1과 ss2의 값이 같습니다");
		}else {
			System.out.println("ss1과 ss2의 값이 다릅니다");
		}
		
		if(ss1.equalsIgnoreCase(ss2)) {
			System.out.println("값이 같습니다");
		}
		
		String[] a1 = str.split(" ");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		System.out.println(a1[2]);
		
		String number = "10";
		int num = Integer.parseInt(number + 1);
		
		
	}//main
}



