import java.util.Arrays;

public class _03_Insertion {

  public static void main(String[] args) {
    int[] nums = {13, 46,24,52,20,9};
    Insertion(nums);

    System.out.println("The array after using insertion sort:"+Arrays.toString(nums));
    
  }
  public static void Insertion(int[] nums){

    for(int i = 0;i<nums.length;i++){
      int j = i;
      while(j>0 && nums[j-1]>nums[j]){
        int temp = nums[j-1];
        nums[j-1] = nums[j];
        nums[j] = temp;
        System.out.println(Arrays.toString(nums));
        j--;
      }
    }



  }
}
