package PlacementSimpleQuestions;

public class SumOfDigits {
	
	static int sum=0;

	public static void main(String[] args) {
		
		String num="12345";
		for(int i=0;i<num.length();i++)
		{
			int n=Integer.parseInt(num.charAt(i)+"");
			sum+=n;
		}
		
		System.out.println(sum);
	}

}
