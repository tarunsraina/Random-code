package PlacementSimpleQuestions;

import java.util.Scanner;

public class LongestAndSubArrayCodechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int max=1;
		    int curMax=0;
		    if(n==1)
		    {
		        System.out.println(1);
		    }
		    else{
		    for(int i=0;i<n;i++)
		    {
		        max+=max&i;
		        if(max>=curMax)
		        {
		            curMax=max;
		        }
		        if(max<=0)
		        {
		            max=1;
		        }
		    }
		    
		    System.out.println(max/2);
		    }
		}
	}
}

