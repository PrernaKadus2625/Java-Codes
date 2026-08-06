public class mergesort {
    public static void sort(int arr[],int si ,int ei){
        if(si>=ei){
            return;
        }
        int mid = (si + ei)/2 ;
        sort(arr , si , mid);
        sort(arr,mid+1 ,ei );
        merge(arr , si , ei ,mid);
    }
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[] = new int [ei-si+1];
        int i = si;    //idx for first sorted part 
        int j = mid +1 ; // for second sorted part 
        int k = 0;       // idx for temp
        
        while(i<= mid && j<=ei){
            if (arr[i]> arr [j]){
                temp[k]= arr[i];
                i++;
            }
            else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        // for leftover elements in 1st sorted part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

         // for leftover elements in 2nd sorted part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for( k=0, i=si ;k< temp.length;k++,i++){
            arr[i]= temp[k];
        }
    }

        public static void main(String args[]){
            int arr[]= {6,8,2,9,1,5};
            sort(arr,0,arr.length-1);
            System.out.println(arr);

        }



    
    
}
