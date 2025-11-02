import java.util.HashMap;


public class _00_HashMap {

  
  public static void main(String[] args) {
    int[] arr = {1,2,3,1,2,1,4,6,9,2,4};

    HashMap<Integer,Integer> h = new HashMap<>();
    for(int i = 0;i<arr.length-1;i++){
      if(!h.containsKey(arr[i])){
        h.put(arr[i],1);

      }else{
        h.put(arr[i], h.get(arr[i])+1);
      }
    }

    h.forEach((key, value) -> {
        System.out.println(key + " occurs " + value + " times");
        });
  }
}