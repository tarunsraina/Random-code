package PlacementSimpleQuestions;
/*
 * Asked in noesys
 * 
 * No of removals needed to balance a string
 * "(()"  - 1
 * "()))" - 2
 * 
 * 
 */
public class EqualBrackets {

	public static void main(String[] args) 
	{
		
			String str="(())((";
			int openCount=0;
			int closeCount=0;
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='(')
				{
					openCount++;
				}
				else
				{
					closeCount++;
				}
			}
			if(openCount>=closeCount)
			{
				System.out.println(openCount-closeCount);
			}
			else
			{
				System.out.println(closeCount-openCount);
			}
	}

}
