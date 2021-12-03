package OOPSpractice;

public class HackerrankInheritance{
	
	// driver code
}

interface AdvancedArithmetic
{
	public int divisor_sum(int n);
}


class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
}

//Write your code here

