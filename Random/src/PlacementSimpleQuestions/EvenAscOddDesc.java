package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class EvenAscOddDesc {

	public static void main(String[] args) {
		
		int arr[]= {4,9,3,1,5,6,7,8,2};
		// Expected output: 2,4,6,8
		//       		    9,7,5,3,1
		
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even.add(arr[i]);
			}
			else
			{
				odd.add(arr[i]);
			}
		}
		
		Collections.sort(even);
		Collections.sort(odd);
		Collections.reverse(odd);
		
		System.out.println(even);
		System.out.println(odd);
		

	}

}
