package recursion;

public class binaryt {
    

    public static void binary(int n ,int lastdigit , String str){
        if (n == 0){
            System.out.println(str);
            return ;
        }
        binary(n-1 ,0,str + "0");
        if (lastdigit == 0){
             binary(n-1 ,1,str + "1");

        

        }
    }
    public static void main(String args[]){
        binary(3,0 ,"");
    }
    
}


