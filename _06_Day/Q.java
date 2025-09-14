import java.util.Arrays;

public class Q {
  public static void main(String[] args) {
    
    int [] nums = {2,4,8,6,5,3,1,7};

    int low = 0;
    int high = nums.length-1;

    QuickSort(nums,low,high);

    System.out.println(Arrays.toString(nums));


  }

  public static void QuickSort(int[] nums, int low, int high){
    if(low<high){
      int pI = partition(nums,low,high);
      QuickSort(nums, low, pI-1);
      QuickSort(nums, pI+1, high);
    }
  }

  public static int partition(int[] nums, int low, int high){

    int pivot = nums[low];

    int i = low;
    int j = high;


    while(i<j){
      while(i<=high && nums[i]<=pivot){
        i++;
      
      }
      while(j>=low && nums[j]>pivot){
        j--;
      }

      if(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
      
    }
      int temp = nums[low];
      nums[low] = nums[j];
      nums[j] = temp;



    return j;

  }
}
