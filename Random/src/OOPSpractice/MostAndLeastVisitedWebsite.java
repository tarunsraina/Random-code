package OOPSpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostAndLeastVisitedWebsite {
	
	// Given array of strings containing websites,print most and least visited website

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"www.fb.com","www.wikipedia.com","www.youtube.com","www.youtube.com","www.fb.com","www.youtube.com"};
		
		ArrayList<websiteVisitersPair> al=new ArrayList<>();
		HashMap<String,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				int val=hm.get(arr[i]);
				hm.put(arr[i],val+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
 
		}
		
		for (Entry<String, Integer> Entryset :hm.entrySet()) 
		{
			websiteVisitersPair wvp=new websiteVisitersPair(Entryset.getKey(),Entryset.getValue());
			al.add(wvp);
        }
		
		wvpComparator wvpc=new wvpComparator();
		Collections.sort(al,wvpc);
		
		System.out.println("Most visited website is "+al.get(0).website);
		
		System.out.println("Least visited website is "+al.get(al.size()-1).website);
		
	}

}

class websiteVisitersPair
{
	String website;
	int visitors;
	
	websiteVisitersPair(String w,int v)
	{
		this.website=w;
		this.visitors=v;
	}
	
}


class wvpComparator implements Comparator<websiteVisitersPair>
{

	@Override
	public int compare(websiteVisitersPair o1, websiteVisitersPair o2) {
		if(o1.visitors>o2.visitors)  return -1;
		if(o1.visitors<o1.visitors)  return 1;
		return 0;
	}
	
}
