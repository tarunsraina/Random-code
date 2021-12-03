package PlacementSimpleQuestions;

public class SwappingWithoutThirdVar {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
	
		a=a+b;  
		b=a-b;   
		a=a-b; 

		
		// or
		
		/*
		a=a*b;
		b=a/b;
		a=a/b;
		*/
		
		// or
		
		/*
		a=a^b;
		b=a^b;   //bitwise XOR   - GFG
		a=a^b;
		*/
		
		
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
