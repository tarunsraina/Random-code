package PlacementSimpleQuestions;

import java.util.ArrayList;

public class FindDuplicates {

	public static void main(String[] args) {
		
		
		int arr[]= {2,3,5,6,5,7,6};
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(al.contains(arr[i]))
			{
				System.out.println(arr[i]);
			}
			else
			{
				al.add(arr[i]);
				
			}
		}
	}

}
