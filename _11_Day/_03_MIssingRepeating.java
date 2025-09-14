package _11_Day;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _03_MIssingRepeating {
  public static void main(String[] args) {

    int[] nums = {3,1,2,5,4,6,7,5};

   System.out.println(Arrays.toString(repeatingMissing(nums)));
    

  }
  public static int[] repeatingMissing(int[] nums){

    int[] hash = new int[nums.length+1];
    int[] res = new int[2];

    for(int num: nums){
      hash[num]++;
    }

    for(int i = 1;i<=nums.length;i++){
      if(hash[i]==2){
        res[0]=i;
      }else if(hash[i]==0&& i!=0){
        res[1]=i;
      }
    }

    return res;
      
    

  }
}
