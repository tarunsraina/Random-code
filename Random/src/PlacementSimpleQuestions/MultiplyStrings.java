package PlacementSimpleQuestions;


//Thought works coding question
public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="3(ab)4(ac)2(aba)";
		// Expected output: abababacacacacabaaba
		String temp="";
		int j;
		for(int i=0;i<str.length()-1;i++)
		{
				int num=str.charAt(i)-'0';;
				if(str.charAt(i+1)=='(')
				{
					j=i+1;
					while(str.charAt(j)!=')')
					{
						j++;
					}
					temp=str.substring(i+2,j);
					
					for(int t=0;t<num;t++)
					{
						System.out.print(temp);
					}
				}
		}
	}

}
