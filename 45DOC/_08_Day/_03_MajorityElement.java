package _08_Day;
import java.util.*;
public class _03_MajorityElement {
  public static void main(String[] args) {

    int[] nums = {2,2,1,1,1,2,2};
    
    Arrays.sort(nums);
    System.out.println(nums[nums.length/2]);
    
  }
}
