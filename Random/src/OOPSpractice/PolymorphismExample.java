package OOPSpractice;

public class PolymorphismExample {
	
	public static int calculate(int n1,int n2)
	{
		return n1+n2;
	}
	
	public static int calculate(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	
	public static int calculate(String str,int a)
	{
		return 0;
	}
	public static int calculate(int a,String str)
	{
		return 1;
	}

	public static void main(String[] args) {
		
		int a=calculate(10,20);    			// method overloading-compile time polymorphism
		int b=calculate("aaa",0);
		int c=calculate(1,"abc");  			// child overriding methods is an example of runtime polymorphism
		int d=calculate(10,20,30);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
