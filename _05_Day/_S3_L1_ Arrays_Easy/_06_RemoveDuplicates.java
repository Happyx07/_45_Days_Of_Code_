public class _06_RemoveDuplicates {


  public static void main(String[] args) {
    int[] nums = {1,1,2};

    System.out.println(removeDuplicates(nums));
  }

  

    public static int removeDuplicates(int[] nums) {
      int k = 1;
      int n = nums.length;
      for(int i = 1;i<n;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
      }
      return k;
    }

}