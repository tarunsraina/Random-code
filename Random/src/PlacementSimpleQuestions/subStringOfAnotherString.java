package PlacementSimpleQuestions;

import java.util.ArrayList;

public class subStringOfAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Tarunteja";
		String str2="run";
		int flag=0;
		char firstChar=str2.charAt(0);
		
		ArrayList<Integer> idx=new ArrayList<>();
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==firstChar)
			{
				idx.add(i);
			}
		}
		
		for(int i=0;i<idx.size();i++)
		{
			String sub=str1.substring(idx.get(i),str2.length()+idx.get(i));
			// System.out.println(sub);
			if(sub.equals(str2))
			{
				System.out.println("Found");
				flag=1;
			}
		}
		
		if(flag==0)
			System.out.println("Not found");
	}

}
