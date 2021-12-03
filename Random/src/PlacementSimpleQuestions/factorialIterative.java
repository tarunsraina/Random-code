package PlacementSimpleQuestions;

public class factorialIterative {
	
	public static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		
		
		int num=6;
		
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		
		System.out.println("factorial of "+num+" is "+fact+"(iterative)");
		
		
		int ans=fact(num);
		System.out.println("factorial of "+num+" is "+ans+"(recursive)");
		

	}

}
