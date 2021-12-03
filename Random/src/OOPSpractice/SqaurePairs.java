
package OOPSpractice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class SqaurePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {3,5,1,2,4};
		
		
		ArrayList<pair> al=new ArrayList<>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			pair obj=new pair(arr[i],arr[i]*arr[i]);
			obj.x=arr[i];
			obj.xS=arr[i]*arr[i];
			al.add(obj);
		}
		pairComparator pc=new pairComparator();
		Collections.sort(al,pc);
		
		for(int i=0;i<arr.length;i++) {
		System.out.println(al.get(i).x+"->"+al.get(i).xS);
		}
		

	}

}

class pair{
	
	int x;
	int xS;
	
	public pair(int n1,int n2)
	{
		this.x=n1;
		this.xS=n2;
	}
}

class pairComparator implements Comparator<pair>{

	@Override
	public int compare(pair o1, pair o2) {
		if(o1.x<o2.x) return -1;
		if(o1.x>o2.x) return 1;
		return 0;
	}

	
	
}
