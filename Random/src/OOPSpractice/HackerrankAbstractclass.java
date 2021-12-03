package OOPSpractice;

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class here

class myBook{
	
	String title;
	
	public void setTitle(String t)
	{
		this.title=t;
	}

	public String getTitle() {
		
		return title;

	}
}

public class HackerrankAbstractclass{
	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		myBook new_novel=new myBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}