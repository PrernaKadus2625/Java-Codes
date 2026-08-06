// if end time is given in sorted order 

package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {

    public static void main (String args[]){
        int start[]= { 1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        
        //if end is sorted
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity 
         maxActivity = 1;
         ans.add(0);
         int Lastend = end[0];
         for (int i =1;i<start.length;i++){
            if(start[i] >= Lastend){
                maxActivity++ ;
                ans.add(i);
                 Lastend = end[i];
            }

         }

         System.out.println("Maximum Activities = "+ maxActivity);
         for(int i = 0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
         }
         
    }
    
}
