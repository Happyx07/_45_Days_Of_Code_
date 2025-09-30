package _24_Day;

public class llbasic {
    public static void main(String[] args) {
      // Creating nodes using our Node Class
      Node head = new Node(5);
      Node n1 = new Node(10);
      Node n2 = new Node(15);
      Node n3 = new Node(20);

      // Connecting Node
      head.next = n1;
      n1.next = n2;
      n2.next = n3;
      n3.next = null; 

      Node current = head;
      int count = 0;
      int max  =0;

      while(current!=null){
        System.out.println(current.data);
        max = Math.max(max,current.data);

        current = current.next;
        count++;
      }

      System.out.println("The number of nodes is:"+count);
      System.out.println("The Max value in the chain is :"+max);

      System.out.println("End");



    }

    public static class Node {

      int data;
      Node next;

      public Node(int data){
        this.data = data;
        this.next = null;
      }

    }

  
}
