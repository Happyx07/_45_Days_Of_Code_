import java.util.Arrays;

public class _09_MoveZeros {
  public static void main(String[] args) {
    int[] nums = {1,3,3,5,0,3,0,6,0,4,0,4,0,50,6,3,30,5,64,6,5,0,60,0,3,3,0,6,5,4,6,0};

    int n = nums.length;

    int k = 0;
    for(int i = 0;i<n-1;i++){
      if(nums[i]!=0){

        nums[k]=nums[i];
        k++;
      } 
    }
    while(k<n-1){
      nums[k]=0;
      k++;
    }

    System.out.println(Arrays.toString(nums));


  }
}
