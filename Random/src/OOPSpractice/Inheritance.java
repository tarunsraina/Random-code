package OOPSpractice;

public class Inheritance {
	
	public void m1()
	{
		System.out.println("From parent class");
	}
	
	public void m2()
	{
		System.out.println("M2 from parent");
	}

	public static void main(String[] args) {
		
		
		child c=new child();
		c.m1();
		c.m2();
		
		Inheritance inh=new Inheritance();
		inh.m1();
		inh.m2();
	
		Inheritance ih2=new child();
		ih2.m1();
		ih2.m2();
		
		
	}
}
	
	class child extends Inheritance
	{
		public void m1()
		{
			System.out.println("From child");
		}
		
		public void Childm2()
		{
			System.out.println("M2 child");
		}
	}


