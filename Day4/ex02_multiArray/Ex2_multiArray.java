package ex02_multiArray;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		char[][] ch = {{'A', 'B'},
				{'C', 'D', 'E'},
				{'F'} };
		
		for (int i= 0; i < ch.length;i++) {
			for (int j=0; j < ch[i].length; j++) {
				
				System.out.print(ch[i][j] + " ");
				
			}//inner
			
			System.out.println();
		
		}//outer
		
		System.out.println("------------------");
		
		
		
		// 배열 arr에 담긴 모든 값의 합과 평균(소수점 한자리까지)을 출력
		int[][] arr = { {6, 4, 2, 1},
				{12, 1, 5},
				{8, 11},
				{2, 1, 7, 7, 3},
				{1, 2, 3} };
		int sum = 0;
		float avg = 0;
		int count = 0;
		
		for (int i = 0; i< arr.length; i++) {
			for (int j =0; j< arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = (float)sum / count;
		System.out.println(sum);
		System.out.printf("%.1f\n", avg);

		
	}//main
}
