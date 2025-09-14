package WeekendRevision.Step_1;

public class Patterns {

  public static void main(String[] args) {
    Pattern1(5);

    Pattern2(5);

    Pattern3(5);

    Pattern4( 5);

    Pattern5(5);

    Pattern6( 5);

    Pattern7(5);
    Pattern8(5);

    Pattern2(5);
    Pattern5(4);

    Pattern11(5);

    Pattern12(5);

    Pattern13(5);
    
    Pattern14(5);    

    Pattern19(5);

  }



  public static void Pattern19(int n ){
    for(int i = 0;i<n;i++){
      for(int j = n-1;j>=i;j--){
        System.out.print("*");
      }
      for(int k = n-i+1;k<=n+i;k++){
        System.out.print(" ");
      }
      for(int j = n-1;j>=i;j--){
        System.out.print("*");
      }
      System.out.println();

    }
    for(int i = 0;i<n;i++){
      for(int j = 0;j<=i;j++){
        System.out.print("*");
      }
      for(int k = 1;k<2*(n-i)-1;k++){
        System.out.print(" ");
      }
      for(int j = 0;j<=i;j++){
        System.out.print( "*");
      }
      System.out.println();

    }
    
  }

  public static void Pattern14(int n ){

    char a = 'A';
      for(int i = 0;i<n;i++){
        for(int j = 0;j<i;j++){

          System.out.print(a);
          a++;
        }
        System.out.println();
        a = 'A';
      }

  }


  public static void Pattern13(int n ){

    int count = 1;
    for(int i = 0;i<=n;i++){

      for(int j = 0;j<i;j++){
        System.out.print(count+" ");
        count++;

      }
      System.out.println();
    }


  }




  public static void Pattern12(int n){

    for(int i = 1;i<=n;i++){
      for(int j = 1;j<i;j++){
        System.out.print(j);
      }
      for(int k = 0; k<2*(n-i);k++){
        System.out.print(" ");
      }
      for(int j = i-1;j>=1;j--){
        System.out.print(j);
      }
      System.out.println();

    }

    
  }

  public static void Pattern11(int n){
    for(int i = 0;i<n;i++){
      for(int j = 0;j<=i;j++){
        if((i+j)%2==0){
          System.out.print(1);
        }else{
          System.out.print(0);
        }
      }
      System.out.println();
    }
    
  }
  
  

  public static void Pattern8(int n){

    for(int i = n;i>0;i--){

      for(int k = 0;k<=n-i;k++){
        System.out.print(" ");
      }
      for(int j = 0;j<2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Pattern7(int n){

    for(int i = 0;i<=n;i++){

      for(int k = 0;k<=n-i;k++){
        System.out.print(" ");
      }
      for(int j = 0;j<2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void Pattern6(int n){

    for(int i = 0;i<=n;i++){
      for(int j = 1;j<=n-i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }


  public static void Pattern5(int n){

    for(int i = 1;i<=n;i++){
      for(int j = n;j>=i;j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void Pattern4(int n){

    for(int i = 1;i<=n;i++){
      for(int j = 1;j<=i;j++){
        System.out.print(i+" ");
      }
      System.out.println();
    }
  }

  public static void Pattern3(int n){

    for(int i = 0;i<=n;i++){
      for(int j = 1;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }

  public static void Pattern2(int n){

    for(int i = 0;i<n;i++){
      for(int j = 0;j<=i;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }




  public static void Pattern1(int n){

    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
}
