public class doubly {
    public class Node{
        int data;
        Node next;
        Node prev;
    

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

 public static Node head;
 public static Node tail;
 public static int size;

 public void addFirst(int data){
    
    Node newnode = new Node(data);
     size++;
     if(head == null){
        head = tail = newnode ;
        return;

    }
    newnode.next = head;
    head.prev = null;
    head = newnode;
    

 }

 public void removeFirst(){
    if(head == null){
        System.out.println("empty");

    }
    if(size == 1){
        head = tail=null;
    }
    head = head.next;
    head.prev = null;
 }

 public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data + "<->");
        temp = temp.next;
    }
    System.out.print("null");

    
 }

 public void reverse(){
    Node curr = head;
    Node prev = null;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next ;
    }
    head = prev;
 }

 public static void main(String args[]){
    doubly ll = new doubly();
    ll.addFirst(4);
    ll.addFirst(8);
    ll.addFirst(10);
    ll.addFirst(9);
    ll.addFirst(5);
    

    ll.removeFirst();
    ll.reverse();
    
    ll.print();


 }



}
