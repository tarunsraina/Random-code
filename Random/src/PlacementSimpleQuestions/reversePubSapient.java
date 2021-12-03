package PlacementSimpleQuestions;

public class reversePubSapient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Hello world ding ding";
		
		String strArr[]=str.split(" ");
		
		String ans="";
		for(int i=0;i<strArr.length;i++)
		{
			StringBuilder sb=new StringBuilder(strArr[i]);
			sb.reverse();
			String temp=sb+"";
			String first=temp.charAt(0)+"";
			ans+=first.toUpperCase()+temp.substring(1).toLowerCase()+" ";
		}
		
		System.out.println(ans);

	}

}
