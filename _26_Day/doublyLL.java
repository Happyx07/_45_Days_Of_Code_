package _26_Day;

public class doublyLL {
  public static class Node{
    int val;
    Node next;
    Node prev;

    Node(int val){
      this.val = val;
    }
  }

  public static void displayTail(Node tail){
    Node temp = tail;

    while(temp!=null){
      System.out.print(temp.val+" ");
      temp = temp.prev;
    }
    System.out.println();
  }

  public static void display(Node head){
    Node temp = head;
    while(temp!=null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static Node insertAtHead(Node head, int x){
    Node t = new Node(x);
    t.next = head;
    head.prev = t;
    head = t;
    return head;
  }

  public static void insertAtTail(Node head, int x){
    Node temp = head;
    while(temp.next!=null){
      temp = temp.next;
    }
    Node t = new Node(x);
    temp.next = t;
    t.prev = temp;
  }

  public static void deleteHead(Node head){
    head = head.next;
    head.prev = null;
  }

  public static void deleteTail(Node head){
    Node current = head;
    while(current.next!=null){
      current = current.next;
    }
    current = current.prev;
    current.next = null;
  }

  

  public static void main(String[] args) {
    Node a = new Node(4);
    Node b = new Node(10);
    Node c = new Node(2);
    Node d = new Node(99);
    Node e = new Node(13);

    a.prev = null;
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    b.prev = a;
    c.prev = b;
    d.prev = c;
    e.prev = d;
    e.next = null;

    display(a);
    Node newHead = insertAtHead(a, 20);
    insertAtTail(a, 100);
    display(newHead);



  }
}
