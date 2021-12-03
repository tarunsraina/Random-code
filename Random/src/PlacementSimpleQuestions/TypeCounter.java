package PlacementSimpleQuestions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class TypeCounter {
	
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        typeCounter(sentence);

        bufferedReader.close();
    }
    
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
    	
    	System.out.println("string"+strCount);
    	System.out.println("integer"+intCount);
    	System.out.println("double"+DoubleCount);

    }

}