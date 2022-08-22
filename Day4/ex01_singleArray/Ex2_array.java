package ex01_singleArray;

public class Ex2_array {
	public static void main(String[] args) {
		
		char[] cArr = new char[4];
		cArr[0] = 'J';
		cArr[1] = 'A';
		cArr[2] = 'V';
		cArr[3] = 'A';

		
		// JAVA 형태로 배열을 출력해보자!
		// System.out.println(cArr);
		for(int i = 0; i < cArr.length; i++) {
			System.out.print(cArr[i]);
		}//for
		
	}//main
}
