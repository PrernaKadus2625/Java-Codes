public class addFirst {

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
    public static int size = 0;

    public static void add(int data){
        Node newnode = new Node(data);  //create a node 

        if (head == null){
            head = tail= newnode;
            size++;
            return;
        }
        newnode.next =head;    //link

        head = newnode;
        size++;
    }
    
    //add last
    public static void last (int data){
        Node newnode = new Node(data);
        if(head==null){
            head = tail = newnode;
            size++;
            return;
        }

        tail.next = newnode;

        tail = newnode;
        size++;

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

    public void middle(int index,int data){
        Node newnode = new Node(data);
        if (index == 0){
            add(data);
            return;
        }
    
        Node temp = head;
        int i =0;
        while(i < index -1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next ;
        temp.next = newnode;
        size++;

    }

  
     public static int removefirst(){
         if (size==0){
            System.out.println("list is empty");
            return 0;

        }
        else if (size==1){
            head=tail=null;
            size--;
            return 0;
        }

        head = head.next;
        return 0;
        

     }

    public static int removelast(){
        if (size==0){
            System.out.println("list is empty");
            return 0;

        }
        else if (size==1){
            head=tail=null;
            size--;
            return 0;
        }
        Node prev = head;
        for (int i=0;i<size-2;i++){
            prev = prev.next;
            
        }
        int val = tail.data;  
        prev.next = null;
        tail = prev;
        size--;
        return val;
       
            
        }
    
        public static int search(int key){
            if(size == 0){
                System.out.println("elelment not found");
            }
            int i =0;
            Node temp = head;
            while(temp != null){
                
                if(temp.data == key){
                    return i;


                }
                temp = temp.next;
                i++;

            }
            return -1;
        }


        //serach key by recursive way 
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if (head.data == key){
                return 0;
            }
            int idx = helper(head.next,key);
            if(idx == -1){
                return -1;
            }
            idx = idx +1 ;
            return idx;
        }
        public int recursivesearch(int key){
            return helper(head,key);
        }

       //reverse
       public void reverse(){
           Node prev= null;
           Node curr = tail = head;
           Node next;
           while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
           }
           head = prev;
       }

       public void deletefromlast(int n){
             //for finding size
             int sz = 0;
             Node temp = head;
             while(temp != null){
                temp = temp.next;
                sz++;
             }
             //if deleted node is head
            if(n == sz){
                head = head.next;
                return;
             }

           //for finding prev of deleted node
             int i=1;
             Node prev = head;
             while(i<sz-n){
                prev = prev.next;
                i++;
             }
             prev.next = prev.next.next;
             return;
            }

       
    public static void main(String args[]){
        addFirst obj = new addFirst();
        obj.print();
        obj.add(2);
        obj.add(5);
        obj.add(7);
        obj.print();
        obj.last(6);
        obj.last(9);
        obj.last(1);
        obj.middle(2,1);
        obj.print();
        System.out.println("after removing last element");
        obj.removelast();
        obj.print();
        System.out.println("after removing first element");
        obj.removefirst();
        
        obj.print();
        System.out.println(obj.search(6));
        
        System.out.print("index of 6 : ");
        System.out.println(obj.recursivesearch(6));

       obj.reverse();
       obj.print();
      
       obj.deletefromlast(2);
       obj.print();



    }
    
}
