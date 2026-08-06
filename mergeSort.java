import java.util.LinkedList;

public class mergeSort {
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

    private Node getmid(Node head){
        Node slow = head ;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ; // mid node

    }

    private Node merging(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL ;

        while(head1 != null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                  head1 = head1.next;
                  temp = temp.next;
            }
            else{
                temp.next = head2 ;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while(head1 != null){
             temp.next = head1;
             head1 = head1.next;
                  temp = temp.next;

        }

        while(head2 != null){
            temp.next = head2 ;
            head2 = head2.next;
            temp = temp.next;

        }
        return mergeLL.next;


    }
    
    public Node merge(Node head){     //main finction
   
        if(head == null || head.next == null){
            return head;
        }

        //find mid 
        Node mid = getmid(head);

        //divide into two parts
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = merge(head);
        Node newRight = merge(rightHead);

        //mergeing
        return merging(newLeft,newRight);
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
    mergeSort ll = new mergeSort();
    ll.add(5);
    ll.add(2);
    ll.add(3);
    ll.add(9);
    ll.print();
    ll.head = ll.merge(ll.head);
    ll.print();
}



}



