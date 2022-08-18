package ex02_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		
		String name = "이";
		// switch 비교값으로는 정수(long)제외, char, string 타입만 사용가능
		
		switch(name) {
		case "김":
			System.out.println("1위");
			break;
			
		case "이":
			System.out.println("2위");
			break;
			
		case "박":
			System.out.println("3위");
			break;
			
		default:
			System.out.println("4위 이상");
			break;
		}//switch
		
		
	}//main
}
