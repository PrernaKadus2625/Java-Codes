package Queue;
    
public class LinkedListQueue {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data ;
            next = null;
        }
 }
     static class QueueB{
    
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
                   return head == null && tail == null;
            }
        
        
        public static void add(int data){
            Node newnode = new Node(data);
            if(isEmpty()){                                 //  OR if(head == null)
                head = tail = newnode;
                return;
            }

            tail.next = newnode;
            tail = newnode;
        }

        public static int remove(){
            if(isEmpty()){ 
                System.out.println("Queue is empty");
                return -1;
        }
        
        int front = head.data;
        if(head == tail){
            head = tail = null;
        }else{
        head = head.next;
        }
        return front ;
        }

        public static int peek(){ if(isEmpty()){ 
                System.out.println("Queue is empty");
                return -1;
        }
        return head.data;

        }
    }
    
        public static void main(String args[]){
        QueueB q = new QueueB();
        q.add(4);
        q.add(7);
        q.add(8);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
       
    
}

    

