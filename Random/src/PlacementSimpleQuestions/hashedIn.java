package PlacementSimpleQuestions;

public class hashedIn {

	public static void main(String[] args) {
	
		int ans=solution(11001);
		System.out.println(ans);
		
		
	}
		public static int solution(int N) {


	        int enable_print = N % 10;
	        while (N > 0) {
	            if (enable_print == 1 && N % 10 != 0) {
	                enable_print = 0;
	            }
	            else if (enable_print == 0 ) {
	                System.out.print(N % 10);
	                
	            }
	            N = N / 10;
	        }
	        
	        return N;

	    }
		
		
	}


