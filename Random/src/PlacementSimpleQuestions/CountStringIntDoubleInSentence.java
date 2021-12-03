package PlacementSimpleQuestions;

public class CountStringIntDoubleInSentence {
	
	
	
public static void typeCounter(String sentence) {
    	
    	String[] strArr=sentence.split(" ");
    	int strCount=0;
    	int intCount=0;
    	int DoubleCount=0;
    	for(int i=0;i<strArr.length;i++)
    	{
    		try
    		{
    			Integer.parseInt(strArr[i]);
    			intCount++;
    		}
    		catch(Exception e)
    		{
    			//not integer-string or double
    			try 
    			{
    				Double.parseDouble(strArr[i]);
    				DoubleCount++;
    			}
    			catch(Exception exp)
    			{
    				// not double
    				strCount++;
    			}
    			
    		}
    	}
    	
    	System.out.println("string "+strCount);
    	System.out.println("integer "+intCount);
    	System.out.println("double "+DoubleCount);

    }


	public static void main(String[] args) {
		
		
		//hdhdhhd obj=new hdhdhhd();
		//obj.typeCounter("jfjfjfj 12 rjrj 2.9");
		
		typeCounter("three 3 two 9.8 hello 8 hgg 8.4 jiii");
		
		
		
		

	}

}
