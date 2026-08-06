public class removecycle {
    
    
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

   
    public static void remove(){
        
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
                
            }

        }
       if(cycle == false){
            return;
       }

       //find meeting point 
       slow = head;
       Node prev = null;
       while(slow != fast){
            prev = fast ;
            slow = slow.next;
            fast = fast.next;
       }

       //remove cycle 
       prev.next = null;

    }

    public static void main (String main[]){
        head = new Node (1);
        
        Node temp = new Node(3);
        head.next = temp;
        head.next.next = new Node(2);
        head.next.next = temp;   // 1 2 3 2 

       System.out.println("cycle exits : "+check());
       remove();
       System.out.println("after remove  : "+ check());

    }


}
