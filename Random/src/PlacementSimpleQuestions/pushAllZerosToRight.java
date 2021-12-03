package PlacementSimpleQuestions;

import java.util.ArrayList;

public class pushAllZerosToRight {

	public static void main(String[] args) {
		
		int arr[]= {10,2,3,0,3,2,1,0,0,1,2,3};
		
		ArrayList<Integer> al=new ArrayList<>();
		
		int zeroCount=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				al.add(arr[i]);
			}
			else
			{
				zeroCount++;
			}
		}
		
		for(int i=0;i<zeroCount;i++)
		{
			al.add(0);
		}
		
		System.out.println(al);

	}

}
