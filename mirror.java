package BinaryST;

public class mirror {

    // Java program to create mirror of a binary tree

    static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

    // Function to create mirror of a binary tree
    public static Node createMirror(Node root) {
        if (root == null) {
            return null;
        }

        // Recursively create mirror of left and right subtrees
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        // Swap left and right
        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    // Inorder traversal to print tree
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Original tree inorder:");
        inorder(root);
        System.out.println();

        // Create mirror
        createMirror(root);

        System.out.println("Mirror tree inorder:");
        inorder(root);
    }
}

    

