package PlacementSimpleQuestions;

public class isSubStringPresent {

	public static void main(String[] args) {
		
		String str1="cognizant";
		String str2="gni";
		
		char first=str2.charAt(0);
		int flag=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==first)
			{
				String sub=str1.substring(i,i+str2.length());
				if(sub.equals(str2))
				{
					System.out.println("found");
					flag=1;
				}
			}
		}
		if(flag==0)  System.out.println("Not found");
	}

}
