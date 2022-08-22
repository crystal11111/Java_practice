package ex03_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		Random rnd = new Random();		// ctrl + shift + O -> import 자동으로 됨
		
		// 1~5 사이의 난수를 만들자
		// rnd.nextInt(발생할 난수의 범위) + 시작 수;
		// rnd.nextInt(끝 수 - 시작 수 + 1) + 시작 수;
		int n = rnd.nextInt(5) + 1;
		System.out.println(n);
		
		// 2~8 사이의 난수를 만들자
		int n1 = rnd.nextInt(7) + 2;
		System.out.println(n1);
		
		// 112~2318 사이의 난수를 만들자
		int n2 = rnd.nextInt(238 - 112 + 1) + 112;
		System.out.println(n2);
		
		System.out.println("-----------------------");
		
		
		// 알파벳 대문자 A~Z 사이의 값을 랜덤으로 한개만 출력
		char n3 = (char) (rnd.nextInt('Z'- 'A' + 1) + 'A');
		System.out.println(n3);
		
		// 10~5000 사이의 난수를 만들 되, 1의 자리가 반드시 0인 난수를 만드시오
		// 2640 <- 1의 자리는 반드시 0!
		int n4 = rnd.nextInt(500-1+1)+1;
		n4 *= 10;
		System.out.println(n4);
		
	}//main
}
