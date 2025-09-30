package _27_Day.RecursionBasics;

import java.util.ArrayList;

public class _12_PowerSet {
  public static void main(String[] args) {

    int[] arr = {1,2,3};
    ArrayList<Integer> result = new ArrayList<>();

    powerSet(arr, 0, result);
    
  }
  public static void powerSet(int[] arr, int index, ArrayList current){
    if(index == arr.length){
      System.out.println(current);
      return;
    }
    powerSet(arr, index+1, current);
    current.add(arr[index]);
    powerSet(arr,index+1, current);
    current.remove(current.size()-1);
  }
}
