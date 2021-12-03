package PlacementSimpleQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicateElementUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,2,3,4,5,6,6};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			boolean bool=set.add(arr[i]);
			if(bool==false)
			{
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
