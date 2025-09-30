package _24_Day;


public class _03_ArraytoList {
  public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};

    LinkedList L = new LinkedList();

    for(int a : arr){
      L.append(a);
    }
    
    L.display();

    L.prepend(5);

    L.display();
    

  }
}


