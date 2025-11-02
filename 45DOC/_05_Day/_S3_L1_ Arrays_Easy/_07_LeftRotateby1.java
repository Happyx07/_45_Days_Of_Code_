import java.util.Arrays;

public class _07_LeftRotateby1 {
  
  public static void main(String[] args) {
    
    int[] arr = {1,2,3,4,5,6,7,8,9};

    leftRotate(arr);

    System.out.println(Arrays.toString(arr));

  }

  public static void leftRotate(int[] arr){

    Reverse(arr,0,arr.length-1);
    Reverse(arr,0,arr.length-2);

  }
  public static void Reverse(int[] arr,int i ,int j){
   
    while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

  }
}
