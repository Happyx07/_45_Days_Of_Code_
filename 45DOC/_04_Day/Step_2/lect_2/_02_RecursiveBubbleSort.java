package _04_Day.Step_2.lect_2;

import java.util.Arrays;

public class _02_RecursiveBubbleSort {

  public static void main(String[] args) {
    int[] arr = {4,3,6,1,5,2};
    int n = arr.length;

    ReBubble(arr, n);

    System.out.println("The Sorted array after Recursive Bubble Sort is:"+Arrays.toString(arr));

  }
  public static void ReBubble(int[] arr, int n){

    if(n==1) return;
    for(int j = 0;j<n-1;j++){
      if(arr[j]>arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }

    ReBubble(arr, n-1);


   }
  
}


