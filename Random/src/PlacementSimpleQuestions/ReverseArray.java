package PlacementSimpleQuestions;


public class ReverseArray {

	public static void main(String[] args) {
		
		
		int arr[]= {2,4,6,8,10};
	    
		int rev[]=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			rev[j]=arr[i];
			j--;
		}
		
		for(int i=0;i<=rev.length-1;i++)
		{
			System.out.print(rev[i]+" ");
		}

}
}
