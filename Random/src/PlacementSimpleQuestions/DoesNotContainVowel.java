package PlacementSimpleQuestions;

import java.util.HashSet;
import java.util.Set;

public class DoesNotContainVowel {

	public static void main(String[] args) {
		
		String str="hellooo hhhhh gggg kkkk aaa aeikfkou ttttt ldfsll ooooo hdsnxxjd yyy";
		String strArr[]=str.split(" ");
		
		Set<String> ans=new HashSet<>();
		
		int flag=0;
		for(int i=0;i<strArr.length;i++)
		{
			String test=strArr[i];
			for(int j=0;j<test.length()-1;j++)
			{
					
					if(	test.charAt(j)=='a' ||
						test.charAt(j)=='e'	||
						test.charAt(j)=='i'	||
						test.charAt(j)=='o'	||
						test.charAt(j)=='u')
						{
							flag=1;
						}
			}
			if(flag==0)
			{
				ans.add(test);
			}
			flag=0;
		}
		System.out.println(ans);

	}

}
