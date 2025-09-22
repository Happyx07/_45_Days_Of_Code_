package _17_Day;

public class MinDaysBouquets {public boolean isPossible(int[] bloomDay, int day, int m, int k){
        int bqtMade = 0;
        int adjFlowers = 0;


        for(int bDay: bloomDay){
            if(bDay<= day){
                adjFlowers++;
            }else{
                adjFlowers = 0;
            }


            if(adjFlowers == k){
                bqtMade++;
                adjFlowers = 0;
            }

        }


        return bqtMade>= m;

    }




    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        if((long)m*k>n){
            return -1;
        }



       int low = Integer.MAX_VALUE;
       int high = Integer.MIN_VALUE;
       for(int day: bloomDay){
        low = Math.min(low, day);
        high = Math.max(high,day);

       }
        int ans = -1;

        while(low<=high){
            int mid = low +(high-low)/2;

            if(isPossible(bloomDay,mid, m, k)){

                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }

        return ans;
        
    }
  
}
