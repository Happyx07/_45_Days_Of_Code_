import java.util.Arrays;

public class _08_LeftRotatebyD{
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7,8,9};

    int d = 4;

    leftRotate(nums,d);

    System.out.println(Arrays.toString(nums));

  }

  public static void leftRotate(int[] nums,int d){
    int i = 0;
    int j = nums.length-1;

    reverse(nums,i,j);
    reverse(nums,i,i+d-1);
    reverse(nums, d, j);

  }

  public static void reverse(int[] nums,int i, int j){
    

    while(i<j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;

      i++;
      j--;
    }
  }
}