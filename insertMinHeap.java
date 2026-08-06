package Heaps;
import java.util.ArrayList;

public class insertMinHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        // Insert a new element
        public void add(int data) {
            arr.add(data); // Add at the end
            int x = arr.size() - 1;       // Index of newly added element
            int par = (x - 1) / 2;        // Parent index

            // Bubble-up process
            while (x > 0 && arr.get(x) < arr.get(par)) {
                // Swap child and parent
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                // Move upward
                x = par;
                par = (x - 1) / 2;
            }
        }

        // Get minimum element (root of heap)
        public int peek() {
            if (arr.size() == 0) {
                System.out.println("Heap is empty");
                return -1; // default value for empty heap
            }
            return arr.get(0);
        }

        // Print heap array
        public void printHeap() {
            System.out.println(arr);
        }
        

        //heapify
        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2 ;
            int minIdx = i ;                //minIdx starts as the current index (we assume it’s the smallest for now)

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left ;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right ;
            }

            if(minIdx != i){              //If the parent (i) is not the smallest that means left or right child is smallest 
                //swap 
                int temp = arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx , temp);

                heapify(minIdx);
            }



        }


        //Delete a node 
        public int remove(){

            int data = arr.get(0);

            //1. swap 1st and last 
            int lastIdx = arr.size() - 1;
            int temp = arr.get(0);
            arr.set(0,arr.get(lastIdx));
            arr.set(arr.size() - 1 , temp );

            //remove last one becuase we shift root to the last elemet
            arr.remove(arr.size() - 1);

            // to rearrange tree after changing position we used heapify process
            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        heap.add(10);
        heap.add(5);
        heap.add(8);
        heap.add(2);
        heap.add(1);

    while(!heap.isEmpty()){
        System.out.println(heap.peek());
        heap.remove();
    }
    
    }
}

