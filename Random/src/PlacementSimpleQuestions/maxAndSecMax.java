package PlacementSimpleQuestions;

public class maxAndSecMax {

	static int max=Integer.MIN_VALUE;
	static int secMax=Integer.MIN_VALUE;
	public static void main(String[] args) {
		
		int arr[]= {7,10,1,23,21,12,19,34,3,4};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>=secMax)
			{
				secMax=arr[i];
			}
		}
		
		System.out.println("Max="+max);
		System.out.println("Second max="+secMax);
	}

}
