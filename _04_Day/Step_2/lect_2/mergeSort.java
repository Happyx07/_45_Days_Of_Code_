package _04_Day.Step_2.lect_2;

import java.util.ArrayList;

public class mergeSort {
  public static void main(String[] args) {
   int[] arr ={4,2,1,6,7} ;
   int low = 0;
   int high = arr.length-1;

   

   System.out.println("Before sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSrt(arr,low,high);
        System.out.println("After sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
   
  }

  public static void mergeSrt(int[] arr, int low, int high){
    if(low>= high) return;

    int mid = (low+high)/2;

    mergeSrt(arr, low,mid);

    mergeSrt(arr,mid+1,high);

    merge( arr,low,mid,high);

    
  }
  public static void merge(int[] arr, int low, int mid, int high){

    ArrayList<Integer> temp = new ArrayList<>(); // temporary array;
    int left = low;      // starting index of the left half of arr
    int right = mid+1;   // starting index of the right half of arr

    while(left<=mid && right<=high){
      if(arr[left]<=arr[right]){
        temp.add(arr[left]);
        left++;
      }else{
        temp.add(arr[right]);
        right++;
      }
    }
    // if elements on the left half are still left

    while(left<= mid){
      temp.add(arr[left]);
      left++;
    }

    while (right<=high){
      temp.add(arr[right]);
      right++;
    }

    // transferring all elements from temp to arr//


    for(int i = low;i<=high;i++){
      arr[i] = temp.get(i-low);
    }

  }
  
}
