package PlacementSimpleQuestions;

public class RemoveOccurrencesOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="explanation";
		String ans="";
		char rem='a';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==rem)
			{
				continue;
			}
			else
			{
				ans+=str.charAt(i)+"";
			}
		}
		
		System.out.println(ans);

	}

}
