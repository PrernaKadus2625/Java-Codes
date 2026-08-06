package Backtracking;

public class array {
    public static void changearray(int arr[],int idx,int value){
          if (idx == arr.length){
             printarray(arr);
             return;
          }

        arr[idx] = value;
        changearray(arr,idx+1,value+1);
        arr[idx] = arr[idx] - 2;
        
    }

    public static void printarray(int arr[]){
        for (int idx=0;idx < arr.length;idx++){
            System.out.print(arr[idx] + " ");
        }
        System.out.println(" ");

    }


    public static void main(String args[]){
        int arr[] = new int[5];
        changearray(arr,0,1);
         printarray(arr);
    }
    
}
