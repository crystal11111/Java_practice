package ex4_operator;

public class Ex2_operator {
	public static void main(String[] args) {
				
		// 논리연산자: 비교연산자를 통한 연산이 두개 이상 필요할때 사용
		int age = 30;
		int limit = 35;

		// and(&&)연산자: 앞쪽 연산이 거짓인 경우 뒤쪽의 연산을 수행하지 않는다.
		// 참 && 참 = 참
		// 참 && 거짓 = 거짓
		// 거짓 && 참 = 거짓
		// 거짓 && 거짓 = 거짓
		boolean res = limit - age > 5 && ++age >= 30;
		System.out.println(res);
		System.out.println(age);
		
		
		// or(||)연산자: 앞쪽 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
		// 참 || 참 = 참
		// 참 || 거짓 = 참
		// 거짓 || 참 = 참
		// 거짓 || 거짓 = 거짓
		int n1 = 10;
		int n2 = 20;
		res = n2 - 10 == 11 || (n1 += 10) > 20;
		System.out.println(res);
		System.out.println(n1);
		
		
		// not(!)연산자: !를 통해 참은 거짓으로, 거짓은 참으로 변경
		boolean b = true;
		System.out.println(!b);		// 영구적으로 유지되지 않음
		System.out.println(b);		
		
		System.out.println("----------------------");
		
		
		// 삼항(조건)연산자
		// 하나의 조건식을 주고 그 조건이 참일때와 거짓일때를 모두 커버하는 결과를 얻어내기 위한 연산자
		int a1 = 10;
		int a2 = 15;
		boolean res2 = ++a1 >= a2-10 ? true : false;
		System.out.println(res2);
		
		int i1 = 10;
		int i2 = 20;
		char res3 = (i1 += i1) == i2 ? 'y' :'n';
		System.out.println(res3);
		
		System.out.println("----------------------");
		
		int aa = 10;
		int bb = 12;
		res = ++aa >= bb || 2 + 7 <= bb && 13 - bb >= 0 && (aa += bb) - (aa % bb) > 12;
			//	11 >= 12 || 9 <= 12 && 1 >= 0 && 23-11 > 12
			//	   false || true && true && false
			//		true && false
			//		= false
		System.out.println(res);
		
	}
}
