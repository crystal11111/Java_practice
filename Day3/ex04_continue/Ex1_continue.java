package ex04_continue;

public class Ex1_continue {
	public static void main(String[] args) {
    
    //continue문: 반복문 내에서 특정 문장을 건너 뛰고자 할때 사용
    for(int i = 1;i<=2;i++){
      for(int j=1;j<=4;j++){
        
        if(j%2==0){
          // for문 내부의 continue는 가장 가까운 for문의 증감식으로 이동
          continue;
        }
        
        syso(j+"");
      }
      syso();
    } 
  }
