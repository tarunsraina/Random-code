package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInTheArray{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[arr.length-1]);
        int max=ans.get(0);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                ans.add(arr[i]);
                max=arr[i];
            }
        }
        
        Collections.reverse(ans);
        return  ans;
    }
}