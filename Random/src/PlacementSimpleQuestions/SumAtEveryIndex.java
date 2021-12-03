package PlacementSimpleQuestions;

import java.util.Scanner;

public class SumAtEveryIndex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=arr[0];
		
		for(int i=1;i<=n;i++)
		{
			try {
			System.out.print(sum+" ");
			sum+=arr[i];
			}
			catch(Exception e)
			{
				break;
			}
		}
		System.out.println();

	}

}
