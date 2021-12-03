package PlacementSimpleQuestions;

import java.util.ArrayList;

public class PoliceCatchThiefGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=1;
		String str[]= {"p","t","t","p","t"};
		ArrayList<policeThiefCapacity> al=new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("p"))
			{
				policeThiefCapacity ptc=new policeThiefCapacity("p",k,i);
				al.add(ptc);
			}
			else
			{
				policeThiefCapacity ptc=new policeThiefCapacity("t",1,i);
				al.add(ptc);
			}
		}
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).pORt.equals("p"))
			{
				for(int j=0;j<k;j++)
						al.remove("t");
			}
		}

	}

}

class policeThiefCapacity{
	
	String pORt;
	int idx;
	int capacity;
	
	policeThiefCapacity(String p,int c,int i)
	{
		this.pORt=p;
		this.capacity=c;
		this.idx=i;
	}
}
