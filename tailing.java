package recursion;

public class tailing {
    public static int problem(int n){
        if (n == 0 || n ==1 ){
            return 1;
        }
        //vertical choice 
        int fnm1 = problem(n -1);
        //horizantal choice
        int fnm2 = problem(n -2);

        int totalways = fnm1 + fnm2;

        return totalways;
        }

        public static void main (String args[]){
            System.out.println(problem(4));
        }
    }
    

