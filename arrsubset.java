package Backtracking;

public class arrsubset {
     public static int sub(String set , String ans , int idx){
        if (idx == set.length()) {
        
            if (ans.length()== 0){
            System.out.println("Null");
            }
        
            else {
            System.out.print(ans);
            }
         return 1;
    }
    
        //yes choice
        sub(set , ans + set.charAt(idx),idx + 1);

        //no choice
        sub(set , ans , idx+1);
        return 0;
    }

    public static void main(String args[]){
          String set = "abc";
          sub(set , " ",0);
    }

}
    


