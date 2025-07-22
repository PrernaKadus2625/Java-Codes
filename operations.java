package ArrayList;
import java.util.ArrayList;

public class operations {
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    
    list.add(2);
    list.add(5);
    list.add(7);
    System.out.println(list);
    
    //get element
    int element = list.get(1);
    System.out.println("element at index 1 is "+ element);
    
    //remove element
    int num = list.remove(2);
    System.out.println("remove element "+num);
    System.out.println(list);
    
    //set new value
    int number = list.set(1,10);
    System.out.println("After set new value  "+list);

    //contains
    System.out.println("element is contain or not :" + list.contains(10));

    //size
    System.out.println("size of arraylist is " + list.size());

    //print elements in reverse order
    System.out.println("Elements in reverse order");
    for(int i = list.size()-1;i>=0;i--){
        System.out.print(list.get(i) + " ");
    }

}
}
