package PlacementSimpleQuestions;

import java.util.HashSet;
import java.util.Set;

public class duplicateRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,2,1,6};
		
		Set<Integer> s=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			s.add(arr[i]);
		}
		
		System.out.println(s);

	}

}
