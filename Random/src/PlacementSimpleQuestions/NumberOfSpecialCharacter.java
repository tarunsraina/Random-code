package PlacementSimpleQuestions;

public class NumberOfSpecialCharacter {

	public static void main(String[] args) {
	
		String str="fhh**&&))dd";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				continue;
			}
			else
			{
				count++;
			}
		}
		System.out.println(count);

	}

}


