package _12_Day;
import java.util.HashMap;

public class _02_PrefixSumLongestSubArray {
  
  public static void main(String[] args) {
    int[] nums = {9, -3, 3, -1, 6, -5};
    


    System.out.println(subArray(nums));
    
  }

  public static int subArray(int[] nums){

    HashMap<Integer,Integer> h = new HashMap<>();
    int n = nums.length;
    int prefixSum = 0;
    int maxLen = 0;

    for(int i = 0;i<n;i++){

      prefixSum += nums[i];

      if(h.containsKey(prefixSum)){
        int pI = h.get(prefixSum);
        int length = i - pI;
        maxLen = Math.max(maxLen, length);
      }else{
        h.put(prefixSum,i);
      }

    }

    return maxLen;
  }

}
