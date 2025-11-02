public class BasicHashing {
  public static void main(String[] args) {

    int[] nums = {1,2,1,3,2};

    int[] q = {1,3,4,2,10};

    freq(nums, q);


    
  }
  public static void freq(int[] nums, int[] q){
  
    for(int i = 0;i<q.length;i++){
      int count=0;
      for(int j = 0;j<nums.length;j++)
      if(nums[j]==q[i]){
        count++;
        System.out.println("The query"+q[i]+" has Appeared in nums:"+count);
      }
      if(count==0){
        System.out.println("The query"+q[i]+" has Appeared in nums:"+count);
      }
    }

  }

}
