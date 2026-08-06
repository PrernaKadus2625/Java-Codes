package Binary_Tree;

public class subtree {
    
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

    public static boolean isIdentical(Node root , Node subroot){
        if(root == null && subroot== null){
            return true;
        }

        else if(root == null|| subroot == null || root.data != subroot.data){
            return false;
        }

        if(!isIdentical(root.left , subroot.left)){
            return false;
        }
        
        
        if(!isIdentical(root.right , subroot.right)){
            return false;
        }

        return true ;

    }

    public static boolean subtree(Node root , Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return subtree(root.left,subroot) || subtree (root.right , subroot);
    }

     public static void main(String main[]){
        Node root = new Node(1);
        root.left =new Node(7);
        root.right = new Node(9);
        root.left.left = new Node(1);
        root.right.left = new Node(3);

        Node subroot = new Node(7);
        subroot.left = new Node(1);

        System.out.print(subtree(root,subroot));

}
}