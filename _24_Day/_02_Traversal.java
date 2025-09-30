package _24_Day;


public class _02_Traversal {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();

    
    l.append(4);
    l.append(5);
    l.append(10);
    l.append(20);

    l.printAll();

    System.out.println(l.findSecondLast());
    System.out.println(l.countEven());
    System.out.println(l.getAt(3));

   

   
   
  }
  
}
