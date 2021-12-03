package OOPSpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaabbbbbbbbccdddd";
		HashMap<String,Integer> hm=new HashMap<>();
		ArrayList<StringFreqPair> al=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)+""))
			{
				int v=hm.get(str.charAt(i)+"");
				hm.put(str.charAt(i)+"",v+1);
				StringFreqPair sfp=new StringFreqPair(str.charAt(i)+"",v+1);
				al.add(sfp);
			}
			else
			{
				StringFreqPair sfp=new StringFreqPair(str.charAt(i)+"",1);
				hm.put(str.charAt(i)+"",1);
			}
		}
		
		StrFreqPairComparator sfpc=new StrFreqPairComparator();
		Collections.sort(al,sfpc);
		System.out.println(al.get(0).s+" with frequency of "+al.get(0).val);
	
		

	}

}

class StringFreqPair{
	
	String s;
	int val;
	
	StringFreqPair(String w,int v)
	{
		this.s=w;
		this.val=v;
	}
	
}

class StrFreqPairComparator implements Comparator<StringFreqPair>
{

	@Override
	public int compare(StringFreqPair o1, StringFreqPair o2) {
		if(o1.val<o2.val)  return 1;
		if(o1.val>o2.val)  return -1;
		return 0;
	}
	
}
