package ex04_continue;

public class Ex2_continue {
	public static void main(String[] args) {
    
    int n =0;
    while(n<5){
      n++;
      if(n%2 ==0){
        // while안에서 사용된 continue는 조건식으로 건너뛴다
        continue;
      }
      
      syso(n);
      
    }//while
    
  }//main
}
