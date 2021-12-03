package PlacementSimpleQuestions;

/*
 * 
 * 
 *  Asked in noesys
 *  
 *  
 * Given a movie rating,pass image names as argument to some other class.
 * 
 * Three images: half.jpg  , full.jpg  , empty.jpg
 * 
 * 0.38 ->  half empty empty empty empty 
 * 
 * 4    ->  full full full full empty 
 * 
 * conditions: round off to next half  (0.38  -----> 0.5)
 * 
 * 
 * 
 * 
 * 
 */

public class MovieRating {

	public static void main(String[] args) {
		
		String rating="4.54";
		String ans="";
		
		String fNum=rating.charAt(0)+"";  //0
		String lnum=rating.charAt(2)+"";  //38
		
		int num1=Integer.parseInt(fNum);
		int num2=Integer.parseInt(lnum);
		for(int i=0;i<num1;i++)
		{
			ans+="full ";
		}
		
		if(num2<=5)
		{
			ans+="half ";
		}
		else
		{
			ans+="full ";
		}
		
		for(int i=num1+1;i<5;i++)
		{
			ans+="empty ";
		}
		
		System.out.println(ans);
		

	}

}
