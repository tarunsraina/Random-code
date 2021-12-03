package PlacementSimpleQuestions;

import java.util.Scanner;

public class jumpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        // System.out.println();
        int initialPos=sc.nextInt();
        
        int move=sc.nextInt();
        
        int jump=sc.nextInt();
        
        for(int i=0;i<jump;i++)
        {
        	System.out.print(initialPos+" ");
        	initialPos+=move;
        }
        System.out.println();
	}

}
