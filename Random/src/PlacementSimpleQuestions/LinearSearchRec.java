package PlacementSimpleQuestions;

public class LinearSearchRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int key=43;
		int arr[]= {2,6,43,65,25,5,3,2};
		int idx=LinearSearch(key,arr,0);
		if(idx==-1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("found at "+idx);
		}

	}

	private static int LinearSearch(int key,int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n>arr.length-1)
		{
			return -1;
		}
		if(arr[n]==key) return n;
		return LinearSearch(key,arr,n+1);
		
	}

}
