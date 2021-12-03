package PlacementSimpleQuestions;

import java.util.ArrayList;

public class FibIterarive {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(0);
		al.add(1);
		
		System.out.println("Enter num");
		int num=7;    //alter your num here
		
		for(int i=2;i<=num;i++)
		{
			al.add(al.get(i-1)+al.get(i-2));
		}
		
		System.out.println(al.get(num));

	}

}
