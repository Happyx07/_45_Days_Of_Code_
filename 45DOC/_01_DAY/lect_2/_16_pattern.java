public class _16_pattern {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n){

    char a = 'A';
    for(int i =0 ;i<n;i++){
      for(int j=0;j<n-i;j++){
        System.out.print(" ");
      }
      for(int k = 0;k<2*i-1;k++){
        if(k+1>=i){
          
          System.out.print(a);
          a--;
          
        }else{ 
        System.out.print(a);
        a++;
      }
      }
      System.out.println();
      a = 'A';
    }

    
  }
}
