package BinaryST;

public class insert {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data ;
            this.left = null;
            this.right = null; 
        }
    }

    public static Node ins(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root ;

        }

        
        if(val < root.data){
            root.left = ins(root.left ,val);        // left subtree
        }
        else{
            root.right = ins(root.right,val);       // right subtree
        }
        return root;


    }

     public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
     }

     public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }
          if(root.data > key){
            return search(root.left , key);
        }
        else{
            return search(root.right,key);
        }
     }

    public static void main(String args[]){
        Node root = null;
        int value[] = { 4,7,2,9,1,10};

        for(int i = 0; i < value.length ;i++ ){
              root = ins(root,value[i]);
        }
   
        inorder(root);
        System.out.println(" ");

        if(search(root,9)){
            System.out.print("Found");

        }
        else{
             System.out.print(" Not Found");

        }
  
     
    }
    
}
