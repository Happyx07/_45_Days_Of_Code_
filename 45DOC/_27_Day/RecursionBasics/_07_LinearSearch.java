package _27_Day.RecursionBasics;

public class _07_LinearSearch {
  public static void main(String[] args) {
    int[] arr = {3,2,2,1,3,6,9,8,7,9};

    System.out.println(linearSearch(arr, 7, arr.length));

  }

  public static int linearSearch(int[] arr, int k, int n){

    
    if(n<=0)return -1;
    if(arr[n-1]==k)return n-1;
    return linearSearch(arr, k, n-1);
  }
  
}
