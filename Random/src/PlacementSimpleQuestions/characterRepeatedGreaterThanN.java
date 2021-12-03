package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class characterRepeatedGreaterThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		TreeMap<String,Integer> tm=new TreeMap<>();
		
		String str=sc.nextLine();
		int n=sc.nextInt();
		
		String strArr[]=str.split(" ");
		ArrayList<String> ans=new ArrayList<>();
		for(int i=0;i<strArr.length;i++)
		{
			int val;
			try {
				val=tm.get(strArr[i]);
			}
			catch(Exception e)
			{
				val=0;
			}
			if(val<1)
			{
				tm.put(strArr[i],1);
			}
			else
			{
				int x=val+1;
				tm.put(strArr[i],x);
				if(x>=n)
				{
					if(!ans.contains(strArr[i]))
					{
						ans.add(strArr[i]);
					}
				}
			}
		}
		
		for(int i=0;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}

	}

}
