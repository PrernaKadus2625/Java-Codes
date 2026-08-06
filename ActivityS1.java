// if end time is not given in sorted order 

package GreedyAlgorithm;
import java.util.*;

public class ActivityS1 {
    
    public static void main (String args[]){
        int start[]= { 1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int activities[][] = new int[start.length][3];
        for(int i= 0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1]= start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
        
        int maxActivity = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity 
         maxActivity = 1;
         ans.add(activities[0][0]);
         int Lastend = activities[0][2];
         for (int i =1;i<start.length;i++){
            if(start[i] >= Lastend){
                maxActivity++ ;
                ans.add(activities[i][0]);
                 Lastend = activities[i][2];
            }

         }

         System.out.println("Maximum Activities = "+ maxActivity);
         for(int i = 0;i<ans.size();i++){
            System.out.print("A" + ans.get(i) + " ");
         }
         
    
    
}
}

