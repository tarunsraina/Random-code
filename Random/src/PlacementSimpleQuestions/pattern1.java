package PlacementSimpleQuestions;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(5);
	}
		public static void pattern1(int n)
		{
		    int cnt=1;
		    for(int i=0; i<2*n-1; i++){
		        for(int j=0; j<(Math.abs(n-1-i)); j++)
		        		System.out.print(" ");
		        for(int j=0; j<2*(n-Math.abs(n-1-i))-1; j++) 
		        	System.out.print(cnt++);
		    }
		        System.out.println();
		    }
}
