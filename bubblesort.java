public class bubblesort {
    public static void sorting(int arr[]){
        for (int turn=0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
              System.out.print(arr[i] + " ");
        }
       System.out.println(); 
    }
    public static void main(String args[]){
        int arr[]={5,7,3,2,1};
        sorting(arr);
        print(arr);

    }
}
