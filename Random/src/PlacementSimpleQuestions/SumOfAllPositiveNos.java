package PlacementSimpleQuestions;

public class SumOfAllPositiveNos {

	public static void main(String[] args) {

		
		int arr[]= {1,-1,-2,5,2,-8,10};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				continue;
			}
			else
			{
				sum+=arr[i];
			}
		}
		
		System.out.println(sum);

	}

}
