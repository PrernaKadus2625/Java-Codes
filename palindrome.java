public class palindrome {

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

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow ; //slow is my middle node
    }

    public boolean check(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findmid(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check 
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
            
        }
         return true;
    }

    public static void add(int data){
        Node newnode = new Node(data);  //create a node 

        if (head == null){
            head = tail= newnode;
           
            return;
        }
        newnode.next =head;    //link

        head = newnode;
    } 
    

    public static void main(String args[]){
        palindrome obj = new palindrome();
        
        obj.add(2);
        obj.add(1);
        obj.add(2);
        System.out.println(obj.check());

    
}
    }

