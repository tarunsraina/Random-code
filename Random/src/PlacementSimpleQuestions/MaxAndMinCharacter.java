package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxAndMinCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str="aAkliP";
		
		ArrayList<Integer> al=new ArrayList<>();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			al.add((int) str.charAt(i));
		}
	
		
		Collections.sort(al);
		
		System.out.println(al.get(0)+al.get(al.size()-1));

	}

}
