package PlacementSimpleQuestions;

public class pattern2 {

	public static void main(String[] args) {

		int n=10;
		
		//pattern2(n);
		
		//pattern3(n);
		
		//pattern4(n);
		
		//pattern5(n);
		
		pattern6(n);

	}
	
	private static void pattern6(int n) {
		
		for(int i=0;i<n;i++)
		{
			int spaces=n-i;
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int t=0;t<n-i-1;t++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
	}

	private static void pattern5(int n) {
		
		
		for(int i=1;i<=n;i++)
		{
			int spaces=n-i-1;
			for(int j=0;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			
			for(int t=0;t<i;t++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void pattern4(int n) {
		
		pattern2(n);
		pattern3(n);
		
	}

	private static void pattern3(int n) {
		
		for(int i=0;i<n;i++)
		{

			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

	public static void pattern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
