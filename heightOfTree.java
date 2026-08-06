package Binary_Tree;

public class heightOfTree {
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
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height (root.right);
            int ht = Math.max(lh,rh) + 1;
            return ht;
        }

        public static int count(Node root){
            if (root == null){
                return 0;
            }
            int leftCount = count(root.left);
            int rightCount = count(root.right);
            return leftCount + rightCount+1;
        }

        public static int sum(Node root){
            if (root == null){
                return 0;
            }
            int leftsum = sum(root.left);
            int rightsum = sum(root.right);
            return leftsum + rightsum + root.data;
        }

       public static int diameter(Node root){       //o(n*n) i.e n square
             if(root == null){
                return 0;
             }
             int leftdia = diameter(root.left);
             int lht = height(root.left);
             int rightdia = diameter(root.right);
             int rht = height(root.right);

             int selfdia = lht + rht +1 ;

             return Math.max(selfdia,Math.max(leftdia,rightdia));
             


       }
    

    public static void main(String main[]){
        Node root = new Node(1);
        root.left =new Node(7);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.right.left = new Node(3);

        System.out.println(height(root));

         System.out.println("No of Nodes are " +count(root));

           System.out.println("Sum of nodes is " + sum(root));

            System.out.print("diameter of nodes is " + diameter(root));

        

    }
    
}
