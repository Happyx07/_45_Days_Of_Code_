package _lect_2;
public class _01_LongestSubarray {



  public static void main(String[] args) {

    int[] nums = {2,3,5};
    int target = 5;
    int maxLen = 0;

    for(int i= 0;i<nums.length;i++){
      int cSum = 0;
      for(int j = i;j<nums.length;j++){
        
        
          cSum+=nums[j];
      
        if(cSum==target){

          maxLen = Math.max(maxLen, j-i+1);

        }
      }
    }

    System.out.println(maxLen);
    


  }
}