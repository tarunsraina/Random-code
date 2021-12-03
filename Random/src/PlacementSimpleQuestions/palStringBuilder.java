package PlacementSimpleQuestions;

public class palStringBuilder {

	public static void main(String[] args) {
		
		String str="malayalam";
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		if(str.equals(sb+""))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		

	}

}
