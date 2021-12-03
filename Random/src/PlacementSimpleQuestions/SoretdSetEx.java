package PlacementSimpleQuestions;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SoretdSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SortedSet<Character> set = new TreeSet();   
		
		set.add('a');
		set.add('x');
		set.add('d');
	
		set.remove('x');
		
		Iterator<Character> itr = set.iterator(); 
		
	    while(itr.hasNext())
	    { 
	    	System.out.println(itr.next());
	    }

		

	}

}
