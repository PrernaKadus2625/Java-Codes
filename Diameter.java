package Binary_Tree;

public class Diameter {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }

    static class info{
        int diam;
        int ht;

        public  info(int diam , int ht){
            this.diam = diam ;
            this.ht = ht;
        }
    }

    public static info diameter(Node root){

        if(root == null){
            return new info(0,0);

        }

        info left = diameter(root.left);
        info right = diameter(root.right);

        int diam = Math.max(Math.max(left.diam , right.diam), left.ht + right.ht +1);
        int ht = Math.max(left.ht , right.ht) + 1;

        return new info(diam , ht);

    }
     public static void main(String main[]){
        Node root = new Node(1);
        root.left =new Node(7);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.right.left = new Node(3);
    
       System.out.println("Diameter of tree is: " + diameter(root).diam);
     
    
}
}