package _18_Day;

import java.util.Arrays;

public class _01_AggressiveCow {

    public static boolean canBe(int[] stalls, int k, int minDistance){
        
        int cowPlaced = 1;
        int lastCowPosition = stalls[0];
        
        for(int i = 1; i<stalls.length; i++){
            if(stalls[i]-lastCowPosition >= minDistance){
                cowPlaced++;
                lastCowPosition = stalls[i];
            }
            
            if(cowPlaced >= k){
                return true;
            }
        }
        
        return false;
    }
    
    
    
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        
        int n = stalls.length;
        
        int low = 1;
        int high = stalls[n-1] - stalls[0];  // maximum possible distance
        int ans = 0;
        
        while(low<=high){
            int mid = low +(high-low)/2;
            
            if(canBe(stalls,k , mid)){
                ans = mid;     
                low = mid +1;    // Search in the Right Half for even larger possible answer.
            }else{
                // This distance is too large, it's not possible to place the cows.
                high = mid-1;
            }
        }
        
        return ans;
      }

      public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int k = 3;
        System.out.println("The largest minimum distance is: " + aggressiveCows(stalls, k)); // Output: 3
    }
  
}
