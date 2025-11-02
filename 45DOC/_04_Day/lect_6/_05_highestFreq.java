import java.util.*;

public class _05_highestFreq {
  

  // highest and loweset frequency elements;

  public static void main(String[] args) {

    int[] arr = {10,5,10,15,10,5};
    
    hlf(arr);
  
  }

  public static void hlf(int[] arr){
    HashMap<Integer,Integer> mp = new HashMap<>();

    for(int i =0;i<arr.length;i++){
      if(mp.containsKey(arr[i])){
        mp.put(arr[i],mp.get(arr[i])+1);
      }else{
        mp.put(arr[i],1);
      }
    }

    int maxFreq = 0,minFreq = arr.length;
    int maxEle = 0, minEle = 0;

    for(Map.Entry<Integer,Integer> entry: mp.entrySet()){

     int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);


  }
}
