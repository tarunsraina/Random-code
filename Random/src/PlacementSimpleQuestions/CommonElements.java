package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

		public static Set<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
		
	    {
	       
	        
	        ArrayList<Integer> al=new ArrayList<>();
	        Set<Integer> ans=new HashSet<>();
	        for(int i=0;i<n1;i++)
	        {
	            al.add(A[i]);
	        }
	        
	        for(int i=0;i<n2;i++)
	        {
	            if(al.contains(B[i]))
	            {
	                ans.add(B[i]);
	            }
	        }
	        
	        for(int i=0;i<n3;i++)
	        {
	            if(al.contains(C[i]))
	            {
	                ans.add(C[i]);
	            }
	        }
	        
	        return ans;
	    }
		
		
		public static void main(String arg[])
		{
			int n1 = 6; 
			int[] A = {1, 5, 10, 20, 40, 80};
			int n2 = 5; 
			int[] B = {6, 7, 20, 80, 100};
			int n3 = 8; 
			int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
			
			System.out.println(commonElements(A,B,C,n1,n2,n3));
			
			
		}

	}

