import java.util.*;

public class _02_LargestElement {

  public static void main(String[] args) {
    int[] nums = { 2,9,8,4,5,1,6};

    Arrays.sort(nums);

    System.out.println("The largest element of the given array is :"+ nums[nums.length-1]);


  }
  
}
