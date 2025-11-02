public class _01_countDigit {


  public static void countDigits(int n){
    int count = 0;
    while(n>0){
      n = n/10;
      count++;
    }
    System.out.println(count);
    
  }
  public static void main(String[] args) {
    countDigits(45554584); //8
  }
}
