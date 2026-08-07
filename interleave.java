// for even no.of elements

package Queue;
import java.util.*;
public class interleave {
    public static void inter(Queue<Integer> q){
        Queue<Integer> firstHalves = new LinkedList<>();
         int size = q.size();

        for(int i =0;i<size/2;i++){
            firstHalves.add(q.remove());
         }

         while(!firstHalves.isEmpty()){
             q.add(firstHalves.remove());
             q.add(q.remove());
         }

    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        inter(q);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();

        }
    }
    
}
