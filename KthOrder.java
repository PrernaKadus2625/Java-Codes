package Binary_Tree ;
public class KthOrder {
    static class Node{
        int data;
        Node left ;
        Node right;

        Node(int data){
            this.data =  data;
            this.left = left ;
            this.right = right;
        }

    }

    public static void level(Node root , int level , int k){
        if(root == null){
            return ;
        }
        if (level == k){
            System.out.print(root.data + " ");
            return ;
        }

        level(root.left , level +1,k);
        level(root.right , level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        int k = 2;
        level(root ,1,k);

}
}
