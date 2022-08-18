package ex02_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		char ch = 'D';
		
		switch(ch) {//비교값
		case 'A':
			System.out.println("90 ~ 100");
			break;
			
		case 'B':
			System.out.println("80 ~ 89");
			break;
			
		case 'C':
			System.out.println("70 ~ 79");
			break;
			
		case 'D':
			System.out.println("60 ~ 69");
			break;
			
		case 'F':
			System.out.println("59점 이하");
			break;
			
		default:
			System.out.println("올바른 성적을 입력하세요");
			break;
		}
		
		
	}
}
