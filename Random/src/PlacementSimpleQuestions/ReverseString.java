package PlacementSimpleQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Hello";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		
		
		// or
		
		String str1="Hello";
		for(int i=str1.length()-1;i>=0;i--)
		{
			System.out.print(str1.charAt(i));
		}
		

	}

}
