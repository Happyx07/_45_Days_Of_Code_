package _12_Day;

public class LargestSubArray {

  public static void main(String[] args) {
    int[] nums = {5, 6, 7};
    // this will print the length of the longest subArray whose sum is 0
    System.out.println(LongestSubArray(nums));


  }

  public static int LongestSubArray(int[] nums){
  

    int n = nums.length;
    int maxLen = 0;

    for(int i = 0;i<n;i++){
      int curSum = 0;
       for(int j = i;j<n;j++){
        curSum += nums[j];
        if(curSum==0){
          maxLen = Math.max(maxLen, j-i+1);
        }
       }
    }

    return maxLen;
  }


  
}
