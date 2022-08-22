package ex04_work;

import java.util.Random;

public class Ex2_work {
	public static void main(String[] args) {
		// lotto 배열에 중복되지않는 1~45사의의 난수를 넣어보세요
		
		Random rnd = new Random();
		
		int n = rnd.nextInt(45 - 1 +1) +1;
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] += n;
			System.out.println(lotto[i]);
		}
				
	}
}
