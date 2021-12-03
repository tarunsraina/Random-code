package PlacementSimpleQuestions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n=153;
		String num=n+"";
		int sum=0;
		for(int i=0;i<num.length();i++)
		{
			int n1=Integer.parseInt(num.charAt(i)+"");
			sum+=Math.pow(n1,3);
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}

	}

}
