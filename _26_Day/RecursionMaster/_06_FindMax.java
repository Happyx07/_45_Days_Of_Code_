package _26_Day.RecursionMaster;

public class _06_FindMax {
  public static void main(String[] args) {

    int[] nums = {1,2,3,5,4,2,6,8,1,2,6,3,5};
    
    
  }

  public static int findMax(int[] nums, int n){
    if(n==1)return nums[0];
    return Math.max(nums[n-1],findMax(nums, n-1));
  }
}
