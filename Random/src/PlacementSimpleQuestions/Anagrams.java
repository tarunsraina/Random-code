package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
public class Anagrams {

	public static void main(String[] args) {
		
		String str1="dog";
		String str2="god";
		
		
		
		System.out.println(str1);
		String[] strArr1=str1.split("");
		String[] strArr2=str2.split("");
		
		ArrayList<String> al1=new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		
		for(int i=0;i<strArr1.length;i++)
		{
			al1.add(strArr1[i]);
		}
		
		for(int i=0;i<strArr2.length;i++)
		{
			al2.add(strArr2[i]);
		}
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		if(al1.equals(al2))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not angrams");
		}

	}

}
