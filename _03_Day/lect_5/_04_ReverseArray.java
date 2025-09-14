

public class _04_ReverseArray {
  
  public static void main(String[] args) {
    int n = 8;
    int[] arr = {1,2,3,4,5,6,7,8};
    System.out.println("Original Array:");
    printArray(arr);
    reverse(arr,0,n-1);
    System.out.println();
    System.out.println("Reversed Array:");
    printArray(arr);
    
  }
  public static void reverse(int[] arr, int start, int end){

    if(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      reverse(arr, start+1, end-1);
    }


  }

  public static void printArray(int[] arr){
    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
