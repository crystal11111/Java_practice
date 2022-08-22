package ex01_singleArray;

public class Ex1_array {
	
	public static void main(String[] args) {
		
		int s1 = 100;
		int s2 = 200;
		int s3 = 300;
		int s4 = 400;
		
		System.out.println(s1);	// ctrl + alt+ 방향키 = 복사 간편키
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("-----------------------");
		
		
		// 자원들은 편하게 관리하고 제어하기 위해 배열을 사용
		// 배열 -> stack, heap
		// stack -> 변수, 자료형
		// heap -> stack에 저장되는 데이터 메모리 사용, index 방 번호
		
		// 1) 배열 선언
		int[]arr;
		
		// 2) 배열 생성
		// 최초로 배열 생성시 방(index) 갯수는 프로그램이 종료될때까지
		// 절대로 변경되지 않는다
		arr = new int[4];
		
		// 3) 배열 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500;		// 배열에 존재하지 않는 방(index)에 값을 넣거나 사용하는 것은 불가
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (i + 1) * 10;
			System.out.println(arr[i]);
		
		}//for
		
		
		
		
		
		
		
		
	}//main
}
