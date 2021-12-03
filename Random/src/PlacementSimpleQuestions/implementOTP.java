package PlacementSimpleQuestions;

import java.util.Random;
import java.util.Scanner;

public class implementOTP {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int TaskDone=0;
		int attempt=3;
		int wrongCred=0;
		while(TaskDone!=1)
		{
			Random rand=new Random();
			int genOtp=rand.nextInt(1000000);
			
			System.out.println("Enter the number appearing on the screen ( "+attempt+" attempts only)");
			attempt--;
			System.out.println(genOtp);
			String entOtp=sc.next();
			
			
			String genOtpToStr=genOtp+"";
			if(genOtpToStr.equals(entOtp))
			{
				System.out.println("Login successful!");
				TaskDone=1;
			}
			else
			{
				wrongCred++;
				if(wrongCred>=3)
				{
					System.out.println("Exiting!");
					System.exit(0);
				}
			}
		}
		
	}

}
