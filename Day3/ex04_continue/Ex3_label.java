// label break
out:for(int i=1; i<=5; i++){
  for(int j=1;j<=5; j++){
    if(j%2==0){
      // out이라는 이름을 가진 반복문을 빠져나간다
      break out;
    }
    syso(j+" ");
    
  }//inner
