package PlacementSimpleQuestions;

import java.util.Scanner;

public class FindId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int id=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==id)
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
