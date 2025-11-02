package _08_Day;

import java.util.*;

public class twoSum {

  public static void main(String[] args) {
    
    int[] nums = {2,7,11,15};
    int target = 9;

    int[] result = tSum(nums, target);
    System.out.println(Arrays.toString(result));
  }

  public static int[] tSum(int[] nums, int target) {
    Map<Integer,Integer> mp = new HashMap<>();

    for(int i = 0; i < nums.length; i++){
      int complement = target - nums[i];

      if(mp.containsKey(complement)){
        // Return indices
        return new int[]{mp.get(complement), i};
      }
      mp.put(nums[i], i);
    }
    return new int[]{}; // No solution found
  }
}



