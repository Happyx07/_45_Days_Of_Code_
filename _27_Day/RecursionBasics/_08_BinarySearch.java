package _27_Day.RecursionBasics;

public class _08_BinarySearch {
  public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,7,8,9};

    System.out.println(binarySearch(arr, 0, arr.length, 9));
    
  }

  public static int binarySearch(int[] arr, int low , int high, int k){
    if(low>high) return -1;

    int mid = low + (high-low)/2;

    if(arr[mid]==k)return mid;

    if(k<arr[mid]){
      return binarySearch(arr, low, mid-1, k);
    }else{
      return binarySearch(arr,mid+1, high, k);
    }
  }
}
