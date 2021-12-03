package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class cubeCount {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int cubeRoot=(int)Math.round(Math.cbrt(arr[i]));
			
			if(cubeRoot*cubeRoot*cubeRoot==arr[i])
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
