package ex01_singleArray;

public class Ex3_array {

	public static void main(String[] args) {
		
		// 배열의 선언, 생성 및 초기화를 한번에
		String[] sArr = {"안녕", "하세요", "반갑", "습니다"}; 
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.print(sArr[i]);
		
		}//for
		
		System.out.println("----------------------");
		
		// 배열 arr에 담긴 모든 값의 합과 평균을 출력
		// 합: 38
		// 평균: 3.6...(소수점 한자리까지만 표기)
		int[] arr = {5, 17, 2, 4, 10};
		int sum = 0;
		float avg = 0;
		
		for (int i=0; i< arr.length; i++) {
			sum += arr[i];
		}
		
		avg = (float)sum / arr.length;
		
		System.out.println(sum);
		System.out.printf("평균: %.1f\n", avg);
		
		System.out.println("---------------------");
		
		
		
		// arr2에 담긴 값중, 가장 큰 값을 출력
		// 결과: 21
		int[] arr2 = {7, 19, 21, 1, 3, 15};
		int max = arr2[0];
		
		for (int i = 1; i < arr2.length; i++) {
			if(arr2[i] > max) {
				max = arr2[i]; 
			}
		}
		System.out.println(max);
		
		
	}//main
}
