package _13_.step_4;

public class _01_BinarySearch {

  public static void main(String[] args) {
    int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
    int k = 6;

    System.out.println(binarySearch(nums, k));


  }

  public static int binarySearch(int[] nums, int k){

    int s = 0;
    int e = nums.length-1;

    while(s<=e){
      int mid = (s+e)/2;
      if(nums[mid]==k)return mid;
      else if(k>nums[mid]) s = mid+1;
      else e = mid -1 ;


    }
    return -1;
  }  
}
