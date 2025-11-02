package _23_Day;

 class Node {
  int data;
  Node next;

  public Node(int data){
    this.data = data;
    this.next = null;
  }
}

public class basic {
  public static void main(String[] args) {
    Node first = new Node(5);
    Node second = new Node(15);
    Node third = new Node(25);
    Node fourth = new Node(35);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = null;

    Node current = first;

    while(current != null){
      System.out.println(current.data + " ->");
      current = current.next;
    }
    System.out.println("End");

  }
  
}


