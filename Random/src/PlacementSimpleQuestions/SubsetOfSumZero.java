package PlacementSimpleQuestions;

import java.util.ArrayList;


public class SubsetOfSumZero {

	static int flag=0;
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<>();
		int sum=0;
		int[] arr= {9,-3,3,1,1};
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 || sum==0 || al.contains(sum))
			{
				flag=1;
			}
			else
			{
				al.add(sum);
			}
		}
		
		if(flag==1)
		{
			System.out.println("There is a subarray with sum zero");
		}
		else
		{
			System.out.println("There is a NO subarray with sum zero");
		}

	}

}
