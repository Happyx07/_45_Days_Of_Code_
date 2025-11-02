package _24_Day;

class LinkedList {
   
    private Node head ;

    // Constructor - creates empty list
    public LinkedList() {
        this.head = null;
    }
    
    // Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    public void append(int data){
      Node newNode = new Node(data);

          if(head==null){
            head = newNode;
            return;
          }

      Node current = head;
      while(current.next!=null){
      current = current.next;}
      current.next = newNode;
    }
    
    // Display all elements
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    
    // Get size of list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(int value){
      Node current = head;
      while(current!=null){
        if(current.data == value){
          return true;
        }else{
          current = current.next;
        }
      }
      return false;
    }

    public int getFirst() {
    if (head == null) {
        return -1;  // or throw exception
    }
    return head.data;
}

public int getLast() {
    if (head == null) {
        return -1;  // or throw exception
    }
    
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    return current.data;
}

    // Pattern 1: Simple traversal (visiting each node)
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    // Pattern 2: Traversal with condition (find specific value)
    public Node find(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current;  // Found it!
            }
            current = current.next;
        }
        return null;  // Not found
    }
    
    // Pattern 3: Traversal with counting (find position)
    public int indexOf(int value) {
        Node current = head;
        int index = 0;
        
        while (current != null) {
            if (current.data == value) {
                return index;  // Found at this position
            }
            current = current.next;
            index++;
        }
        return -1;  // Not found
    }
    
    // Pattern 4: Traversal with processing (sum all values)
    public int sum() {
        int total = 0;
        Node current = head;
        
        while (current != null) {
            total += current.data;
            current = current.next;
        }
        return total;
    }

    public int findSecondLast(){
      Node current = head;
      
      while(current.next.next!=null){
        current = current.next;
      }
      return current.data;
    }

    public int countEven(){
      Node current = head;
      int count = 0;
      while(current!=null){
        if(current.data%2==0){
          count++;
        }
        current = current.next;
      }
      return count;
    }

    public int getAt(int idx){
      int count = 0;
      Node current = head;

      while(count!=idx){
        current = current.next;
        count++;
      }
      return current.data;
    }

    public int max(){
      int max = head.data;
      Node current = head;
      while(current!=null){
        max = Math.max(max,current.data);
        current = current.next;
      }
      return max;

    }

   public void prepend(int data){
    Node n1 = new Node(head.data);
    n1.next = head.next;
    head.data = data;
    head.next = n1;
   }

   public void insertAt(int position,int data){
    Node n = new Node(data);

    if(position==0)prepend(data);
    int count = 0;
    Node current = head;
    while(count!=position-1){
        current = current.next;
        count++;
    }

    n.next = current.next;
    current.next = n;

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