package PlacementSimpleQuestions;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n=7;
		int ans=fib(n);
		System.out.println(ans);

	}

	private static int fib(int n) {
	
		
		if(n<=1)
		{
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}

}
