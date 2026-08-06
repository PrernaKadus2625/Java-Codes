package BinaryST;

public class deleteNode {
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

    public static Node findIS(Node root){
        while(root.left != null){
            root = root.left;
         
        }
        return root;
    }

    public static Node delete(Node root,int val){
     
        if(val < root.data){
            root.left = delete(root.left ,val);        // left subtree
        }
        else if(val > root.data) {
            root.right = delete(root.right,val);       // right subtree
        }
        else{
        // leaf node
        if(root.left == null && root.right == null){
            return null;
        }
        
        //one child
        if(root.left == null){
            return root.right;

        }
        else if (root.right == null){
            return root.left;
        }

        //two child
        
        Node InS = findIS(root.right);
        root.data = InS.data;
        root.right = delete (root.right ,InS.data);
      
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

    public static void printInRange(Node root , int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data<= k2){
            printInRange(root.left , k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
            
        }
        else if (root.data < k1){
            printInRange(root.left , k1, k2);
            
        }
        else{
             printInRange(root.right, k1, k2);
        }
    }


    public static void main(String args[]){
     Node root = null;
        int value[] = { 8,5,3,1,4,6,10,11,14};

         for(int i = 0; i < value.length ;i++ ){
              root = ins(root,value[i]);
        }
      
       root =  delete(root,1);
       System.out.println("After delele a node");
       inorder(root);
       
        System.out.println();
       System.out.println("Elements in range ");
        printInRange(root,5,11);



}
}
