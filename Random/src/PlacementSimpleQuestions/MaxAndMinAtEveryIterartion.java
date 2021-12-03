package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxAndMinAtEveryIterartion {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		
		
		int n=sc.nextInt();
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
		}
		
		if(n==1)
		{
			System.out.println(al.get(0));
			al.remove(0);
		}
		
		Collections.sort(al);
		//System.out.println(al.size());
		if(al.size()%2==0)
		{
		
			for(int i=0;i<=al.size();i++)
			{
				System.out.println(al.get(al.size()-1)+" "+al.get(0));
				al.remove(0);
				al.remove(al.size()-1);
				
			}
			
			
		}
		else
		{
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(al.size()-1)+" "+al.get(0));
				al.remove(0);
				al.remove(al.size()-1);
				
			}
			
			if(al.size()==3)
			{
				System.out.println(al.get(2)+" "+al.get(0));
				al.remove(0);
				al.remove(al.size()-1);
				
			}
			
			System.out.println(al.get(0)+" "+0);
		}
		
		if(al.size()==2)
		{
			System.out.println(al.get(1)+" "+al.get(0));
		}

	}

}
