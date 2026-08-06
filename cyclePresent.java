public class cyclePresent {
    
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
    
    //floyed cycle finding algorithm
    public static boolean check(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;   //cycle doesnt exit
    }

    public static void main(String args[]){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;              //It form a cycle 
        System.out.println(check());


    }


    
}
