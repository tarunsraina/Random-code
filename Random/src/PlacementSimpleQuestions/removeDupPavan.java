package PlacementSimpleQuestions;



import java.util.ArrayList;
import java.util.Scanner;

public class removeDupPavan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer> al=new ArrayList<>();
		
		
		for(int i=0;i<n;i++)
		{
			if(al.contains(arr[i]))
			{
				continue;
			}
			else
			{
				System.out.println(arr[i]);
				al.add(arr[i]);
			}
		}
	}

}