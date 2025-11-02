package _13_Day.step_4;

public class _02_SearchInsert {
  public static void main(String[] args) {

    int[] nums = {1,3,5,6};
    int k = 7;

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
    return e+1;
  }  
}
