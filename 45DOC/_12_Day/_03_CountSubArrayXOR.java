package _12_Day;

import java.util.HashMap;

public class _03_CountSubArrayXOR {
  public static void main(String[] args) {
    int[] nums = {5, 6, 7, 8, 9};
    int k = 5;

    System.out.println(subArrayXor(nums, k));


  }

  public static int subArrayXor(int[] nums, int k){


    HashMap<Integer,Integer> h = new HashMap<>();
    int n = nums.length;

    int xr = 0;
    h.put(xr,1);
    int count = 0;

    for(int i = 0;i<n;i++){

      xr = xr ^ nums[i];

      int x = xr^k;

      if(h.containsKey(x)){
        count += h.get(x);
      }

      if(h.containsKey(xr)){
        h.put(xr,h.get(xr)+1);
      }else{
        h.put(xr,1);
      }

    }
    return count;


    











    // int n = nums.length;
    // int count = 0;

    // for(int i = 0;i<n;i++){
    //   int curXOR = 0;
    //    for(int j = i;j<n;j++){
    //       curXOR ^= nums[j];
    //     if(curXOR==k){
    //       count++;
    //     }
    //    }
    // }

    // return count;

  }
}


