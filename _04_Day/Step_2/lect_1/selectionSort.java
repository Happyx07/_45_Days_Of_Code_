
// Time complexity O(N^2);
public class selectionSort {

  public static void main(String[] args) {

    int[] nums = {13, 46,24,52,20,9};
    
    sort(nums);
    for(int i = 0;i<nums.length;i++){
      System.out.print(nums[i]+" ");
    }
    
  }

  public static void sort(int[] nums){

    

    for(int i = 0;i<nums.length;i++){
      int cM = i;
      for(int j = i;j<nums.length;j++){

        if(nums[j]<nums[cM]){
          cM = j;
           
        }


      }
      int temp = nums[i];
      nums[i] = nums[cM];
      nums[cM] = temp;
    }
  }
  
}
