package _24_Day;


public class _02_PrintAllNodes {
  public static void main(String[] args) {
    LinkedList LL = new LinkedList();
    LL.append(15);
    LL.append(24);
    LL.append(35);
    LL.append(44);
    LL.append(53);

    LL.display();  // prints all the nodes
    System.out.println(LL.size());// gives the number of nodes in linkedList
    System.out.println(LL.max());
    

  }
}
