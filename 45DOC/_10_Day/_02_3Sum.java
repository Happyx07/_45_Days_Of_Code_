package _10_Day;
import java.util.*;

public class _02_3Sum {
  public static void main(String[] args) {
    int[] nums = {-1,0,1,2,-1,-4};
    
    System.out.println(threeSum(nums));

  }

  public static List<List<Integer>> threeSum(int[] nums){
    List<List<Integer>> ans = new ArrayList<>();
    for(int i = 0;i<nums.length;i++){
      for(int j = i+1;j<nums.length;j++){
        for(int k = j+1;k<nums.length;k++){
          
          if(nums[i]+nums[j]==-nums[k]){
            ArrayList<Integer> triplets = new ArrayList<>();
            triplets.add(nums[i]);
            triplets.add(nums[j]);
            triplets.add(nums[k]);
            ans.add(triplets);
          }
        }
      }
    }
    return ans;
  }

  
  
}
