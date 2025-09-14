import java.util.Arrays;

public class _02_BubbleSort {
  public static void main(String[] args) {
  int[] nums = {13, 46,24,52,20,9};
  Bubble(nums);
  System.out.println(Arrays.toString(nums));

    
  }
  public static void Bubble(int[] nums){
    for(int i =0;i<nums.length;i++){
      for(int j = 1;j<nums.length;j++){
        if(nums[j]<nums[j-1]){
          int temp = nums[j-1];
          nums[j-1] = nums[j];
          nums[j] = temp;
        }
        System.out.println(Arrays.toString(nums));
      }
    }

  }
}
