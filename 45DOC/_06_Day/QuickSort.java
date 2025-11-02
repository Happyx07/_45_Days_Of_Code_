import java.util.*;

public class QuickSort{
  public static void main(String[] args) {
    
    int[] nums = {4,3,1,6,2,9,5,7};

    int low = 0;
    int high = nums.length-1;

    Quicksort(nums,low,high);

    System.out.println(Arrays.toString(nums));



  }

  public static int partition(int[] nums, int low, int high){
    int pivot = nums[0];
    int i = low;
    int j = high;



     while(i<j){
      while(i<=high-1 && nums[i]<=pivot){
        i++;
      }
      while(j>low && nums[j]>pivot){
        j--;
      }

      if(i<j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }

     }

     int temp = nums[j];
     nums[j] = nums[low];
     nums[low] = temp;

     return j;


  }

  public static void Quicksort(int[] nums,int low, int high){

    if(low<high){ 
    int pI = partition(nums,low,high);
    Quicksort(nums, low, pI-1);
    Quicksort(nums, pI+1, high);
    }

  }
}


































// public class QuickSort {
//     public static void main(String[] args) {
//         int[] qt = {2,4,8,6,5,3,1,9,7};
//         int low = 0;
//         int high = qt.length - 1;

//         quickSort(qt, low, high);

//         System.out.println(Arrays.toString(qt));
//     }

//     public static int partition(int[] qt, int low, int high) {
//         int pivot = qt[low];
//         int i = low;
//         int j = high;

//         while (i < j) {
//             // move i forward until a bigger element is found
//             while (i <= high && qt[i] <= pivot) {
//                 i++;
//             }

//             // move j backward until a smaller element is found
//             while (j >= low && qt[j] > pivot) {
//                 j--;
//             }

//             // swap if valid
//             if (i < j) {
//                 int temp = qt[i];
//                 qt[i] = qt[j];
//                 qt[j] = temp;
//             }
//         }

//         // finally put pivot in its correct place
//         int temp = qt[low];
//         qt[low] = qt[j];
//         qt[j] = temp;

//         return j; // return pivot index
//     }

//     public static void quickSort(int[] qt, int low, int high) {
//         if (low < high) {
//             int pI = partition(qt, low, high);
//             quickSort(qt, low, pI - 1);
//             quickSort(qt, pI + 1, high);
//         }
//     }
// }





// public class QuickSort{
//   public static void main(String[] args) {
//     int[] qt = {2,4,8,6,5,3,1,9,7};
//     int low = 0;
//     int high = qt.length-1;

//     quickSort(qt,low,high);

//     System.out.println(Arrays.toString(qt));
//   }

//   public static int partition(int[] qt,int low,int high){
//     int pivot = qt[low];
//     int i = low;
//     int j = high;

//     while(i<j){
//       while(i<= high-1 && qt[i]<=pivot ){
//         i++;
//       }
//       while(j>=low && qt[j]>pivot  ){
//         j--;
//       }
//         if(i<j){
//         int temp = qt[i];
//         qt[i] = qt[j];
//         qt[j] = temp;
//     }
//     }

//     int temp = qt[low];
//     qt[low] = qt[j];
//     qt[j] = temp;
//     return j;
//   }
//   public static void quickSort(int[] qt,int low, int high){
    
//     if(low<high){
//     int pI = partition(qt, low, high);
//     quickSort(qt,low,pI-1);
//     quickSort(qt,pI+1,high);
//     }
//   }


// }

