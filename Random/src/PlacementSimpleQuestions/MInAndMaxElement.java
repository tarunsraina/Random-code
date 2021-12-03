package PlacementSimpleQuestions;

public class MInAndMaxElement {
	
	static int max=Integer.MIN_VALUE;
	static int min=Integer.MAX_VALUE;

	public static void main(String[] args) {
		
		
		int arr[]= {3,4,6,7,88,4,-6,3,0,-1,6,107,9,100};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		
		System.out.println("Max="+max);
		System.out.println("Min="+min);

	}

}
