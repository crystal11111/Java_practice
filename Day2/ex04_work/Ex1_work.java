package ex04_work;

public class Ex1_work {
	public static void main(String[] args) {
		// 기본자료형과 연산자를 사용한 문제
		/*
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은
		 5, 7, 5개
		 과수원에서 하루에 생산되는 과일의 총 갯수를 출력하고
		 시간당 평균 생산갯수를 소수점 2자리까지만 출력.
		 (단, 과일의 갯수와 하루생산량을 저장하는 변수는 int,
		 시간 당 평균을 저장하는 변수는 float으로 만드시오)
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int total = pear + apple + orange;
		System.out.println(total);
		
		float h_total = (float)total/24;
		float avg = total / 24f;
		System.out.printf("%.2f",h_total);
		
		
	}//main
}
