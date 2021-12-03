package PlacementSimpleQuestions;

import java.util.ArrayList;

public class ArrayIntersection {

	public static void main(String[] args) {
		
		int arr1[]= {4,9,5,4};
		int arr2[]= {9,4,9,8,4,4};
		
		ArrayList<Integer> ans=new ArrayList<>();
		if(arr1.length>=arr2.length)
		{
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<arr1.length;i++)
			{
				al.add(arr1[i]);
			}
			
			for(int i=0;i<arr2.length;i++)
			{
				if(al.contains(arr2[i]))
				{
					ans.add(arr2[i]);
				}
			}
		}
		else
		{
			ArrayList<Integer> al=new ArrayList<>();
			for(int i=0;i<arr2.length;i++)
			{
				al.add(arr2[i]);
			}
			
			for(int i=0;i<arr1.length;i++)
			{
				if(al.contains(arr1[i]))
				{
					ans.add(arr1[i]);
				}
			}
		}
		
		System.out.println(ans);

	}

}
