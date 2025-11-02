 package _11_Day;

class _01_MaxProductSubArray {

  public static void main(String[] args) {

    int[] nums = {2,3,-2,4};

    System.out.println( maxProduct(nums));

    
  }



  public static int maxProduct(int[] nums) {
       int curMax = nums[0];
       int curMin = nums[0];
       int maxProd = nums[0];

       for(int i = 1;i<nums.length;i++){
         int num = nums[i];
         int temp = curMax;

         curMax = Math.max(num,Math.max(num*curMax,num*curMin));
         curMin = Math.min(num,Math.min(num*temp,num*curMin));

         maxProd = Math.max(maxProd,curMax);
       }

       return maxProd;
    }

  
}