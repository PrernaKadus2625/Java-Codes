package Binary_Tree;
import java.util.* ;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
            left = null;
            right = null;
        }
    }

    static class binary{
        static int idx = -1;
        public static Node binaryt(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = binaryt(nodes);
            newnode.right = binaryt(nodes);

            return newnode;
        }
        
        //preorder travaersal
        public static void preorder(Node root){
            if (root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        

         public static void inorder(Node root){
            if (root == null){
                return;
            }
           
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }
        
         public static void postorder(Node root){
            if (root == null){
                return;
            }
           
            postorder(root.left);
            postorder(root.right);
             System.out.print(root.data + " ");
        }

        //levelwise traversal
        public static void level(Node root){
            if (root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currnode = q.remove();
                if(currnode == null){
                    System.out.println(" ");
                    if(q.isEmpty()){
                        return ;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currnode.data + " ");
                    if(currnode.left != null){
                        q.add(currnode.left);
                    }
                    if(currnode.right != null){
                        q.add(currnode.right);
                    }

                }

            }

        }



    }

    public static void main(String main[]){
        int nodes[] = { 1,2 ,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary t = new binary();
        Node root = t.binaryt(nodes);
        
         System.out.println("Preorder traversal : ");
        t.preorder(root);
        System.out.println(" ");
        System.out.println("Inorder traversal : ");
        t.inorder(root);
         System.out.println(" ");
         System.out.println("Postorder traversal : ");
         t.postorder(root);

          System.out.println(" ");
         System.out.println("Level traversal : ");
         t.level(root);


      
    }
}

