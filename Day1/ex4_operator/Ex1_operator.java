package ex4_operator;

public class Ex1_operator {
	public static void main(String[] args) {
		
		// Operator
		// 1) 최고연산자: ., ()
		// 2) 증감연산자: ++, --
		// 3) 산술연산자: +, -, *, /, %
		// 4) 시프트연산자: >>, <<
		// 5) 비트연산자: &, |, ^
		// 6) 비교연산자: <, >, >=, <=, ==, !=
		// 7) 논리연산자: &&, ||, !
		// 8) 삼항(조건)연산자: ?, ,, :
		// 9) 대입연산자: =, *=, /=, %=, +=, -=
		
		// 산술연산자: 4칙연산과 나머지 연산자를 가지고있다
		int i1 = 20;
		int i2 = 7;
		int i3 = i1 + i2;
		System.out.println(i3);
		
		i3 = i1 / i2;	// 몫
		System.out.println(i3);
		
		i3 = i1 % i2;	// 나머지
		System.out.println(i3);
	
		float f = i1 / i2;
		System.out.println(f);
		
		System.out.println("--------------------------");
		
		
		// 대입연산자: 특정값을 변수에 전달하여 기억시키는 연산자
		int n1 = 10;
		int n2 = 7;
		n1 += n2;
		System.out.println(n1);
		n1 -= 2;
		System.out.println(n1);
		n1 /= n2;
		System.out.println(n1);
		n2 %= n1;
		System.out.println(n2);
		
		System.out.println("--------------------------");
		
		
		// 비교연산자: 값을 비교하여 참과 거짓을 판단하는 연산자
		int a1 = 10;
		int a2 = 20;
		boolean res = a1 < a2;
		System.out.println("res = a1 < a2 " +res);
		
		res = a1 == a2;
		System.out.println("res = a1 == a2 "+res);
		
		res = a1 != a2;
		System.out.println("res = a1 != a2 "+res);
		
		System.out.println("--------------------------");
		
		
		// 증감연산자: 1씩 증가시키거나 1씩 감소시키는 연산자, 선행증감과 후행증감의 차이점을 구별할 줄 알아야한다
		int a = 10;
		System.out.println("a: "+ ++a);	// 선행증감
		
		int b = 10;
		System.out.println("b: "+ b++);	// 후행증감
		System.out.println(b); 		// 다음 값부터 변경된 값 제공
		b++;
		b--;
		++b;	//12
		b--;	//12
		--b;	//10
		++b;	//11
		b++;	//11
		--b;	//11
		b++;	//11
		System.out.println(b--);	//12
		// 증감연산자는 무조건 1씩만 값을 변경하기때문에
		// 2이상의 값을 변경하고 싶다면 대입연산자를 쓰도록 하자!
		b += 2;
		
		
		
		
	}
}
