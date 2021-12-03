package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * 
 * 
 *   Asked in noesys
 *   
 *  1 need to find nearest enemy i.e., 2
 *  In an array,there can be only one 1,zero or more no of 2
 *  Enemy not found,return -1
[0,1,2,2,2,2,2] -> 1
[0,0,1,0,0,2,0] -> 3
[0,2,1,0,2,0,0] -> 1
[0,1,0,0,0,0,0] ->-1

//

*/

public class FindEnemy {

	public static void main(String[] args) {
		
		int arr[]= {2,0,1,0,0,2,0};
		int pos1=-1;
		//find the position of 1
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				pos1=i;
			}
		}
		
		//find all the indexes with element 2 and store them in arrayList
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==2)
			{
				al.add(i);
			}
		}
		
		ArrayList<Integer> al2=new ArrayList<>();
		
		for(int i=0;i<al.size();i++)
		{
			int pAns;
			int p1=al.get(i)-pos1;
			// if negative ->convert to positive(multiply by -1)
			// if positive ->just copy
			if(p1<0)
			{
				pAns=-1*p1;   
			}
			else
			{
				pAns=p1;
			}
			
			al2.add(pAns);
			
		}
		
		Collections.sort(al2);
		
		System.out.println(al2.get(0));
		
		
		

	}

}
