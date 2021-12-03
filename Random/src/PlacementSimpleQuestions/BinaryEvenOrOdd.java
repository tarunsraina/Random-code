package PlacementSimpleQuestions;

import java.util.Scanner;

public class BinaryEvenOrOdd {

	public static void main(String[] args) {
		
		System.out.println("Enter numbers in binary form");
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		sc.close();
		if(num.charAt(num.length()-1)=='1')
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
		
		// OR
		
		int n1=sc.nextInt(2);
		
		if(n1%2==0)
		{
			System.out.println("even");
		}
		else
			{
				System.out.println("odd");
		}
		

	}

}
