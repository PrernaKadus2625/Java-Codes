package recursion;

public class rotatedarray {

    public static int search(int arr[], int si , int ei , int target){
        
        if (si>ei){
            return -1;
        }
        int mid = si + (ei - si)/2;

        // target is on mid
        if (arr[mid]== target){
            return mid;
        }
        
        //mid is on line 1
        if (arr[si]<= arr[mid]){
            // target is on left
            if (arr[si]<= target && target <=arr[mid]){
                return search(arr ,si,mid-1,target);
            }

            else{
                return search(arr, mid+1,ei,target);
            }

        }
        // mid on line 2
        else{
            // on right
            if (arr[mid]<= target && target <= arr[ei]){
                return search(arr,mid+1,ei ,target);
            }
            //left
            else{
                 return search(arr ,si,mid-1,target);
            }

        }

    }

    public static void main(String args[]){
        int arr []= { 4,5,6,7,0,1,2,3};
        int target = 0;
        int idx = search(arr , 0 ,arr.length-1, target);
        System.out.println(idx);

    }
    
}
