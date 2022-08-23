package ex01_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		// 자바의 클래스 중 가장 대표적이라고 할 수 있는 String클래스를 알아보자
		// **String 클래스의 두가지 특징
		// 1) 객체생성법이 두가지(암시적, 명시적)
		// 2) 한번 생성된 문자열은 변하지 않는다.(불변의 특징) (immutable)
		
		String s1 = "abc";		// 스택의 메모리는 힙에 저장됨
		String s2 = "abc";		// ---> Stack: s1, Heap: "abc"
		String s3 = new String("abc");	// 집(메모리)을 새로 만듦
		String s4 = new String("abc");	// 집(메모리)을 새로 만듦
		
		// 객체간 ==은 값이 아닌 주소를 비교하는 연산자
		if(s1 == s3) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		if(s2 == s4) {
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		String a1 = "안녕";
		String a2 = "안녕";
		a1 += "하세요";
		System.out.println(a1);
		System.out.println(a2);
		
	}//main
}

