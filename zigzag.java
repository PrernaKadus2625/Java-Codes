
public class zigzag {
       public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;

        }
    }
    public static Node head;
    public static Node tail;


    public static void add(int data){
        Node newnode = new Node(data);  //create a node 

        if (head == null){
            head = tail= newnode;
          
            return;
        }
        newnode.next =head;    //link

        head = newnode;
       
    }

   
   public static void zig(){
    // find mid
     Node slow = head ;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
     
    // reverse 2nd half 
    Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;
        Node nextL,nextR ;

        //zig zag merge
        while(right != null && left !=null){
             nextL = left.next ;
             left.next = right;
             nextR = right.next;
             right.next = nextL;
        

        left = nextL ;
        right = nextR;

   }
}

   public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }





public static void main(String[] args) {
    // Create the linked list using your static addFirst() method
    zigzag ll = new zigzag();
    ll.add(5);
    ll.add(2);
    ll.add(3);
    ll.add(9);
    ll.print();
    ll.zig();
    ll.print();
}
}










