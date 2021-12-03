package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,10,20,30,10};
		
		System.out.println("Enter element to delete:");
		
		int del=sc.nextInt();
		
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]==del))
			{
				ans.add(arr[i]);
			}
				
		}
		
		System.out.println(ans);

	}

}
