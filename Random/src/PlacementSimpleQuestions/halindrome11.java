package PlacementSimpleQuestions;

public class halindrome11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1=4;
		String[] input2= {"hshsds","ccc","ghf","as"};
		
		int ans=halindrome(input1,input2);
		System.out.println(ans);
		

	}

	public static int halindrome(int input1, String[] input2) {
		
		int count=0;
		for(int i=0;i<input2.length;i++)
		{
			String s=input2[i];
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			if(s.equals(sb+""))
			{
				count++;
			}
			else
			{
				
				String str=input2[i];
				if(str.length()%2==0)
				{
					String first=str.substring(0,str.length()/2);
					String last=str.substring(str.length()/2);
					
					StringBuilder sbf=new StringBuilder(first);
					StringBuilder sbl=new StringBuilder(last);
					sbf.reverse();
					sbl.reverse();
					if(first.equals(sbf+"")&&(last.equals(sbl+"")&&(first.length()>=2)&&(last.length()>=2)))
					{
						count++;
					}
				}
				else
				{
					String first=str.substring(0,str.length()/2);
					String last=str.substring(str.length()/2+1);
					
					StringBuilder sbf=new StringBuilder(first);
					StringBuilder sbl=new StringBuilder(last);
					sbf.reverse();
					sbl.reverse();
					if(first.equals(sbf+"")&&(last.equals(sbl+"")&&(first.length()>=2)&&(last.length()>=2)))
					{
						count++;
					}
				}
				
			}
		}
		
		return count;
	}

}
