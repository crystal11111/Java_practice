package ex03_break;

public class Ex1_break {
	public static void main(String[] args) {
      
    // break문: 반복문 내에서 강제적으로 가장 가까운 반복문을 빠져나가기 위해 사용
    
    for (int i =1; i<=2; i++){
      for (int j=1;j<=5;j++){
         if(j%2==0){
            break;
         }
            syso(j);
        
      }//inner
      
      syso();
      
    }//outer
    
    
    
  }//main
}
