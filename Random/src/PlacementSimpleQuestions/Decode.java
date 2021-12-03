package PlacementSimpleQuestions;

import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		
		
		for(int i=0;i<str.length();i++) {
			
			
			if(Character.isLowerCase(str.charAt(i)))
			{
				sb.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				sb.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		
		System.out.println(sb);
		
		
		
		

	}

}
