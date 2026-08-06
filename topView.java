package Binary_Tree;
import java.util.*;

public class topView {

    static class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class info{
        int hz;
        Node node ;

        public info(Node node, int hz){
       
            this.node = node;
            this.hz = hz;

        }
    }
    public static void topView(Node root) {
    Queue<info> q = new LinkedList<>();
    HashMap<Integer,Node> map = new HashMap<>();

    int min = 0 , max = 0;
    q.add(new info (root,0));
    q.add(null);

    while(!q.isEmpty()){
        info curr = q.remove();
        if(curr == null){
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }
        
       else{
         if(!map.containsKey(curr.hz)){
             map.put(curr.hz , curr.node);
        }


        if(curr.node.left != null){
                q.add(new info(curr.node.left , curr.hz-1));
                min = Math.min(min, curr.hz - 1);
               }

        if(curr.node.right != null){
                q.add(new info(curr.node.right, curr.hz+1));
                max = Math.max(max, curr.hz + 1);
                }
         
       }   
    }
      // Print top view from leftmost to rightmost
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);
    }
}

    

