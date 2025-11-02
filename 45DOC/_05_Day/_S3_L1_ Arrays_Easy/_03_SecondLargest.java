import java.util.*;

public class _03_SecondLargest {

  public static void main(String[] args) {
    int[] nums = {54,6,9,8,98,75,13,11,65,46};

    Arrays.sort(nums);

    System.out.println("The second largest element using inbuilt sort is:"+nums[nums.length-2]);
  }
  
}
