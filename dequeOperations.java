package Queue;
import java.util.*;

public class dequeOperations {
    public static void main(String args[]){
        Deque<Integer> de = new LinkedList<>();
        de.addFirst(3);
        de.addFirst(5);
        de.addLast(8);
        de.addLast(1);
        de.addLast(9);
        System.out.println(de);
        de.removeLast();
        de.removeFirst();
        System.out.println("After removing" + de);

        System.out.println(de.getFirst());
        System.out.println(de.getLast());


    }
    
}
