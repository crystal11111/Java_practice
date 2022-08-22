package ex02_multiArray;

public class Ex1_multiArray {
	public static void main(String[] args) {
		
		// 1차원 배열이 2개 모이면 2차원 배열
		// 1차원 배열이 3개 모이면 3차원 배열...
		
		int[][] arr = new int[2][3];		// [1차원 배열의 수] [각 1차원 배열의 index수]	-> 세로 2줄, 가로 3줄
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		System.out.println(arr[1][1]);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j] + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer
		
	}//main
}
