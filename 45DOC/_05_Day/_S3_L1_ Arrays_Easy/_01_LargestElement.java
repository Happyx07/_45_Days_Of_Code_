import java.util.Arrays;

public class _01_LargestElement {

  public static void main(String[] args) {

    int [] nums= {4,1,7,9,3};

    System.out.println("The given array is:"+Arrays.toString(nums));
    System.out.println("The largest element of the array is "+largestElement(nums));;
    
  }

  public static int largestElement(int[] arr){

    int max = Integer.MIN_VALUE;
    
    for(int i = 0;i<arr.length;i++){
      if(arr[i]>max){
        max = arr[i];
      }

    }

    return max;


  }
  
}
