package PlacementSimpleQuestions;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		String str="malayalam";
		
		if(str.length()%2==0)
		{
			int mid=str.length()/2;
			String firstHalf=str.substring(0, mid);
			String secondHalf=str.substring(mid);
			StringBuilder sb=new StringBuilder(secondHalf);
			sb.reverse();
			if(firstHalf.equals(sb+""))
			{
				System.out.println(str+ " is a Palindrome");
			}
			else
			{
				System.out.println(str+ " is not a Palindrome"); 
			}
		}
		else
		{
			int mid=str.length()/2;
			String firstHalf=str.substring(0, mid);
			String secondHalf=str.substring(mid+1);
			StringBuilder sb=new StringBuilder(secondHalf);
			sb.reverse();
			if(firstHalf.equals(sb+""))
			{
				System.out.println(str+ " is a Palindrome");
			}
			else
			{
				System.out.println(str+ " is not a Palindrome");
			}
		}

	}

}
