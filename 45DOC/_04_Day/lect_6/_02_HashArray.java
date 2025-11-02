

public class _02_HashArray {

  public static void main(String[] args) {
    int[] n = {1,2,1,3,2};
    int[] q = {1,3,4,2,10};

    freq(n, q);
  }
  

  public static void freq(int[] n,int[] q ){
    int[] freq = new int[13];

    for(int i = 0;i<n.length;i++){
      freq[n[i]]++;
    }

    for(int i = 0;i<q.length;i++){
      System.out.println("The frequency of "+q[i]+" is "+freq[q[i]]);
    }
  }
}
