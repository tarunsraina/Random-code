package PlacementSimpleQuestions;
import java.util.HashSet;
import java.util.Set;

public class palindromeAndPerfectSquare {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,-9,8,7,88};
		int sum=0;
		int flag=0;
		Set<Integer> s=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
			if(sum==0||arr[i]==0||s.contains(arr[i]))
			{
				//System.out.println(sum);
				//System.out.println(arr[i]);
				System.out.println("There is a subarray with sum 0");
				flag=1;
			}
			else
			{
				s.add(sum);
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("No subarray with sum zero");
		}

	}

}
