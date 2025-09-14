import java.util.HashMap;

public class _04_HashMap {

  
  public static void main(String[] args) {
    int[] n  = {1,4,6,1,4,2};
    int[] q = {4,2,6};

    freq(n, q);

  }


  public static void freq(int[] n,int[] q){
    HashMap<Integer,Integer> mp = new HashMap<>();

    for(int i = 0;i<n.length;i++){
      int key = n[i];
      int freq = 0;
      if(mp.containsKey(key)) freq = mp.get(key);
      freq++;
      mp.put(key,freq); //inserting into the map
    }

    for(int i = 0;i<q.length;i++){ 
        
            int number;
            number = q[i];
            // fetch:
            if (mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);
          
    }
  }
}