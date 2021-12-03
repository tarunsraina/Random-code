package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class FirstHalfAscSecHalfDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,9,4,8,4,1,2};
		// expected o/p: 1 3 4 9 8 4 2 1
		
		int mid=arr.length/2;
		
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0;i<mid;i++)
		{
			al.add(arr[i]);
		}
		
		for(int i=mid;i<arr.length;i++)
		{
			al2.add(arr[i]);
		}
		
		Collections.sort(al);
		Collections.sort(al2);
		Collections.reverse(al2);
		
		for(int i=0;i<mid;i++)
		{
			System.out.print(al.get(i)+" ");
		}
		
		for(int i=0;i<mid;i++)
		{
			System.out.print(al2.get(i)+" ");
		}
		
		
		

	}

}
