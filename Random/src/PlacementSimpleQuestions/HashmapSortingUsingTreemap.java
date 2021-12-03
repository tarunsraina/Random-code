package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashmapSortingUsingTreemap {

	public static void main(String[] args) {
		
		
		Map<String,Integer> hm=new HashMap<>();
		
		String arr[]= {"www.git.com","www.google.com","www.git.com","www.wiki.com","www.wiki.com","www.git.com","www.apple.com","www.bb.com"};
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				int v=(int) hm.get(arr[i]);
				hm.put(arr[i],v+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
		}
		
		//System.out.println(hm);
		
		//tree map sorts KEYS
		//Map<String,Integer> treeMap=new TreeMap<>(hm);
		
		//System.out.println(treeMap);
		
		ArrayList<Entry<String,Integer>> al=new ArrayList<>(hm.entrySet());
		
		///Collections.sort(al, new Comparator<Entry<String, Integer>>{
			
			//@ovverride
			//public void compare()
			//{
				
			}
		//});
		

	//}

}
