package BinaryST;
import java.util.*;

public class rootToLeafPath {

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

    public static void path(Node root , ArrayList<Integer> p){
        if(root == null){
           return;
        }
        p.add(root.data);
        if(root.left == null && root.right == null){
            print(p);
        }

        path(root.left , p);
        path(root.right , p);
        p.remove(p.size() - 1);

    }

    public static void print(ArrayList<Integer> p){
        for(int i = 0 ;i <p.size() ;i++){
            System.out.print(p.get(i) + " ");
        }
        System.out.println(" ->null");
    }


    public static void main(String args[]){
     Node root = null;
        int value[] = { 8,5,3,1,4,6,10,11,14};

         for(int i = 0; i < value.length ;i++ ){
              root = ins(root,value[i]);
        }

      
      path(root,new ArrayList<>() );
    
     
      }
}

    
