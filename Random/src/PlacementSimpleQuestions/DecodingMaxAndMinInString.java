package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecodingMaxAndMinInString {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.println();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		String num1=n1+"";
		String num2=n2+"";
		String num3=n3+"";
		
		String strArr1[]=num1.split("");
		String strArr2[]=num2.split("");
		String strArr3[]=num3.split("");
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		
		for(int i=0;i<strArr1.length;i++)
		{
			al1.add(Integer.parseInt(strArr1[i]));
		}
		
		for(int i=0;i<strArr2.length;i++)
		{
			al2.add(Integer.parseInt(strArr2[i]));
		}
		for(int i=0;i<strArr3.length;i++)
		{
			al3.add(Integer.parseInt(strArr3[i]));
		}
		
		Collections.sort(al1);
		Collections.sort(al2);
		Collections.sort(al3);
		
		int max=al1.get(al1.size()-1)+al2.get(al2.size()-1)+al3.get(al3.size()-1);
		
		int min=al1.get(al1.size()-2)+al2.get(al2.size()-2)+al3.get(al3.size()-2);
		
		System.out.println(max-min);
		
		

	}

}
