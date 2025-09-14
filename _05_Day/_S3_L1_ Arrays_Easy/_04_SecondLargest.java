

public class _04_SecondLargest {

  public static void main(String[] args) {
    
    int[] nums = { 2,1,4,8,7,6,5,3};

    int max = Integer.MIN_VALUE;
    int sMax = Integer.MIN_VALUE;

    for(int i = 0;i<nums.length;i++){
      if(nums[i]>max && nums[i]>sMax){
        sMax = max;
        max = nums[i];
      }else if(nums[i]>sMax && nums[i]<max){
        sMax = nums[i];
      }
    }

    System.out.print("Largest:"+max+"  Second Largest is:"+sMax);
  }
  
}
