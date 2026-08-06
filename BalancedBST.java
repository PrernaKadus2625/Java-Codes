package BinaryST;
import java.util.*;

public class BalancedBST {

    // Node class
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Step 1: Inorder Traversal to store nodes in sorted order
    public static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    // Step 2: Convert sorted list to Balanced BST
    public static Node sortedListToBST(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));

        root.left = sortedListToBST(list, start, mid - 1);
        root.right = sortedListToBST(list, mid + 1, end);

        return root;
    }

    // Function to balance a BST
    public static Node balanceBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return sortedListToBST(list, 0, list.size() - 1);
    }

    // Utility function: Preorder Traversal to check structure
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Driver code
    public static void main(String[] args) {
        /*
               10
                 \
                  20
                    \
                     30
                       \
                        40
        */

        Node root = new Node(10);
        root.right = new Node(20);
        root.right.right = new Node(30);
        root.right.right.right = new Node(40);

        System.out.println("Preorder of Original BST:");
        preorder(root);

        root = balanceBST(root);

        System.out.println("\nPreorder of Balanced BST:");
        preorder(root);
    }
}
