package PlacementSimpleQuestions;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int ans=fact(n);
		System.out.println(ans);

	}

	private static int fact(int n) {
		
		if(n==0 || n==1)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}

}
