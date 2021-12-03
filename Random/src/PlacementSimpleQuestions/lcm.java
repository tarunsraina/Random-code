package PlacementSimpleQuestions;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=2;
		int b=3;
		
		
		int gcd=1;
		
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
					gcd=i;
		}
		
		int lcm=(a*b)/gcd;
		
		System.out.println(lcm);
	

	}

}
