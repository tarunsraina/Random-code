package PlacementSimpleQuestions;

import java.util.Scanner;

public class SwapAtAdjacentPositions {

	public static void main(String[] args) {
		
		int numssw=39631;
		calc(numssw);

	}

	private static void calc(int num) {
		
		
		String n=num+"";
		String arr[]=n.split("");
		
		if(arr.length%2==0) {
		
		for(int i=0;i<arr.length;i=i+2)
		{
			try {
			String temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
			}
			catch(Exception e)
			{
				break;
			}
		}
		}
		else
		{
			for(int i=0;i<arr.length-1;i=i+2)
			{
				try {
				String temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				}
				catch(Exception e)
				{
					break;
				}
			}
		}
		String n1="";
		for(int i=0;i<arr.length;i++)
		{
			n1+=arr[i];
		}
		
		int ans=Integer.parseInt(n1);
		
		System.out.println(ans);
		
	}

}
