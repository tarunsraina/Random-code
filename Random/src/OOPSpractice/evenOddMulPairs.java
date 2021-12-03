package OOPSpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class evenOddMulPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {4,6,-1,9,8,0,11};
		ArrayList<evenOddMulpair> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenOddMulpair obj=new evenOddMulpair(arr[i],arr[i]*2);
				al.add(obj);
			}
			else
			{
				evenOddMulpair obj=new evenOddMulpair(arr[i],arr[i]*3);
				al.add(obj);
			}
		}
		evenOddMulpairCompare eomc=new evenOddMulpairCompare();
		Collections.sort(al,eomc);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).num+"->"+al.get(i).MulPair);
		}
		

	}

}

class evenOddMulpair
{
	int num;
	int MulPair;
	
	public evenOddMulpair(int n,int m)
	{
		this.num=n;
		this.MulPair=m;
	}
}

class evenOddMulpairCompare implements Comparator<evenOddMulpair>
{

	@Override
	public int compare(evenOddMulpair o1, evenOddMulpair o2) {
		
		if(o1.MulPair<o2.MulPair)   return -1;
		
		if(o1.MulPair>o2.MulPair)   return 1;
		
		return 0;
		
	}
	
}

