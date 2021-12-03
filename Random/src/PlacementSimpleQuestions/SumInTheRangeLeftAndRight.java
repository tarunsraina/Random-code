package PlacementSimpleQuestions;

import java.util.Scanner;

public class SumInTheRangeLeftAndRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		
		int l=sc.nextInt();
		
		int r=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=l-1;i<r;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);

	}

}
