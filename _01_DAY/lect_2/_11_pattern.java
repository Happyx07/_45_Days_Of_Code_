

public class _11_pattern {
  public static void main(String[] args) {
    printPattern(5);
  }

  public static void printPattern(int n){
    for(int i = 0;i<=n;i++){
      for(int j = 1;j<i;j++){
        System.out.print(j);
      }
      
      for(int k = i;k<n;k++){
        System.out.print("  ");
      }
      

      for(int j = i-1;j>0;j--){
        System.out.print(j);
      }
      System.out.println();

    }
   
  }
}
