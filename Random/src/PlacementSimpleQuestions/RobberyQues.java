package PlacementSimpleQuestions;

import java.util.Scanner;

public class RobberyQues {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int N=sc.nextInt();
		int arr[]=new int[N];
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i=i+2)
		{
			try {
			sum1+=arr[i];
			}
			catch(Exception e)
			{
				break;
			}
		}
		
		for(int i=1;i<arr.length;i=i+2)
		{
			try {
			sum2+=arr[i];
			}
			catch(Exception e)
			{
				break;
			}
		}
		
		if(sum1>=sum2)
		{
			System.out.println(sum1);
		}
		else
		{
			System.out.println(sum2);
		}

	}

}
