package ArrayList;
import java.util.*;

public class storeWater {
    public static int water(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=0;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-1;
                int currwater = ht * width;
                maxwater = Math.max(currwater,maxwater);
                }
            
        }
        return maxwater;
    }

    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
         height.add(7);
         System.out.print(water(height));
    }
    
}
