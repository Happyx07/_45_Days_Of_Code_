package _12_Day;

public class _04_CountInversion {
  public static void main(String[] args) {  

    int[] nums = {5,3,2,1,4};
    int count = 0;


    for(int i = 0;i<nums.length;i++){
      for(int j = i+1;j<nums.length;j++){
        if(nums[j]<nums[i]){
          count++;
        }

      }
    }
    System.out.println(count);
  }
}
