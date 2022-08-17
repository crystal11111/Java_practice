package ex02_value_type;

public class Ex3_valueType {
	public static void main(String[] args) {
		
		// 정수형: 소수점이 없는 자연수를 저장하는 자료형
		// byte b = 128;	// byte가 담을 수 있는 표현범위를 벗어난 값을 넣었으므로 오류 발생
		int n = 210000000;
		long lo = 2200000000L;	// int의 범위를 넘겼을 때 L붙혀줌
		
		System.out.println("n: "+ n);
		System.out.println("lo: "+ lo);
	
		
		// 실수형: 소수점을 가진 값을 저장하기위한 자료형
		float f = 3.14F;
		double d = 3.14;
		f = 100;
		d = 100;
		
		System.out.println("f: "+f);
		System.out.println("d: "+d);
		
		
	}
}
