package PlacementSimpleQuestions;

import java.util.Scanner;

/*
 * 
 * 
 * input:"my name is tarun"
 * output:"ym eman si nurat"
 * 
 * 
 */

public class StringReversal {
	
	static String ans="";
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str="my name is tarun";
		String[] spl=str.split(" ");
		for(int i=0;i<spl.length;i++)
		{
			StringBuilder sb=new StringBuilder(spl[i]);
			sb.reverse();
			String conToStr=sb+"";
			ans+=conToStr+" ";
		}
		
		System.out.println(ans);
		

	}

}
