package PlacementSimpleQuestions;

import java.util.Arrays;

public class duplicateElementUsingFreqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,0,2,2,34,6,7,7,8,8};
		
		int freq[]=new int[50];
		
		for(int i=0;i<arr.length;i++)
		{
			
			freq[arr[i]]++;
			
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)
			{
				System.out.println(i);
			}
		}

	}

}
