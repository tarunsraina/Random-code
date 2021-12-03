package OOPSpractice;

import java.util.ArrayList;
import java.util.Comparator;

class myPair{
	
	int var1,var2;
	
	public myPair(int n1,int n2)
	{
		this.var1=n1;
		this.var2=n2;
	}
}

class myComparator implements Comparator<myPair>{

	@Override
	public int compare(myPair o1, myPair o2) {
		if (o1.var2 < o2.var2)
        {
            return -1;
        }
        else if (o1.var2 > o2.var2)
        {
            return 1;
        }
             
        return 0;
	}
	
}

public class pairSorting {

	public static void main(String[] args) {
		
		
		// 2-6 are pair
		
		// 4-1 are pair
		
		// 5-8 are pair
		
		// 11-3 are pair
		
		// 6-9 are pair
		
		// given a and b sort them by 'b' value
		
		// EXPECTED OUTPUT: 4-1  ,  11-3  , 2-6  , 5-8  , 6-9  
		
		myPair obj1=new myPair(2,6);
		myPair obj2=new myPair(4,1);
		myPair obj3=new myPair(5,8);
		myPair obj4=new myPair(11,3);
		myPair obj5=new myPair(6,9);
		
		ArrayList<myPair> al=new ArrayList<>();
		
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		
		System.out.println("Initial values in pair:");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).var1+":"+al.get(i).var2);
		}
		
		
		myComparator mc=new myComparator();
		
		al.sort(mc);
		
		System.out.println("Values after sorting(second value in pair):");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i).var1+":"+al.get(i).var2);
		}
		

	}

}
