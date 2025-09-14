package _08_Day;
import java.util.Arrays;

public class _02_SortColors {
  public static void main(String[] args) {
    int[] nums = {2,0,2,1,1,0};
    int r = 0;
    int w = 0;
    int b = 0;
    


    for(int i = 0;i<nums.length;i++){
      if(nums[i]==0){
        r++;
      }else if(nums[i]==1){
        w++;
      }else{
        b++;
      } 
    }
    for(int i = 0;i<nums.length;i++){
      if(i<r){
        nums[i]=0;
      }
      else if(i>=r && i<(r+w)){
        nums[i] = 1;
      }else if(i>=(r+w) && i<(r+w+b)){
        nums[i] = 2;

      }
    }

    System.out.println(Arrays.toString(nums));

  }

  
}


