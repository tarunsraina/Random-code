package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyArrayMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int freq[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			int x=arr[i];
			freq[x]++;
		}
		
	 ArrayList<Integer> al=new ArrayList<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==i)
			{
				al.add(i);
			}
		}
		
		Collections.sort(al);
		System.out.println(al.get(al.size()-1));
		
		
	}

}
