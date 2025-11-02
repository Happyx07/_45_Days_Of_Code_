public class _05_CheckIfSorted {
  public static void main(String[] args) {
    int [] num1 = {1,2,3,4,5,6,7,8,9};
    int [] num2 = {3,2,1,6,4,9,8,1,3,1,2};

    System.out.println("The array num1 is Sorted:"+Sorted(num1));
    System.out.println("The array num2 is Sorted:"+Sorted(num2));
    

    
  }

  public static Boolean Sorted(int[] arr){
    Boolean s = true;
    for(int i = 1;i<arr.length;i++){
      if(arr[i]>=arr[i-1]){
        continue;
      }else{
        s = false;
        break;
      }
    }
    return s;
  }
}
