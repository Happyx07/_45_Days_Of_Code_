

public class _10_pattern {
  public static void main(String[] args) {
    
    printPattern(5);
  }

  public static void printPattern(int n){
    for(int i = 0;i<=n;i++){
      for(int j = 0;j<i;j++){
        if ((i+j)%2==0) {
          System.out.print(0);
        }else{
          System.out.print(1);
        }

      }
      System.out.println();
    }
  }
  
}
