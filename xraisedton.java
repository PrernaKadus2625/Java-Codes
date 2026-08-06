package recursion;

public class xraisedton {
    public static int pow(int x,int n ){
        if(n==0){
            return 1;
        }
        return x * pow(x, n-1);
    }

    public static int optimized (int a,int b){
        if (b==0){
            return  1;

        }
        int half =optimized(a, b/2);
        int halfsq = half * half ;

        if( b % 2 != 0){
             halfsq = a* halfsq;
        }
        return halfsq;


        }
    
    public static void main ( String args[]){
        System.out.println(pow(2,5));
        System.out.println(optimized(2,5));
    }
    
}
