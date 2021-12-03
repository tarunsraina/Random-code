package OOPSpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IndexPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,5,67,53,21,76,12,11,43,57,98,54};
		
		ArrayList<Index> al=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			Index ix=new Index(arr[i],i);
			al.add(ix);
		}
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));
		
		int s=54;
		
		
		int foundInSorted=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(!(arr[i]==s))
			{
				continue;
			}
			else
			{
				foundInSorted=i;
				break;
			}
		}
		
		int orgIndex=-1;
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).val!=s)
			{
				continue;
			}
			else
			{
				orgIndex=al.get(i).idx;
			}
		}
		
		
		
		
		
		System.out.println("explanation:");
		
		System.out.println(s+" was initially in index "+orgIndex+",later moved to index "+foundInSorted+" after sorting.");
		
		System.out.println("The total index position moved is:");
		
		System.out.println(Math.abs(orgIndex-foundInSorted));

	}

}

class Index{
	
	int val;
	int idx;
	
	public Index(int v,int i)
	{
		this.val=v;
		this.idx=i;
	}
}
