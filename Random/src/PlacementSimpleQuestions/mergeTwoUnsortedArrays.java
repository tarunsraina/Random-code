package PlacementSimpleQuestions;

import java.util.Arrays;

public class mergeTwoUnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,5,1,3,6,2,90,21,45,33};
		int arr2[]= {23,500,11,3,336,2,90,21,45,4,2,54,63};
		
		mergeBoth(arr1,arr2);

	}

	private static void mergeBoth(int[] arr1, int[] arr2) {
		
		int arr[]=new int[arr1.length+arr2.length];
		//System.out.println(arr.length);
		for(int i=0;i<arr1.length;i++)
		{
			arr[i]=arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<arr.length;i++)
		{
			arr[i]=arr2[j];
			j++;
		}
		
		///System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSort(int[] arr,int l,int r) {
		// TODO Auto-generated method stub
		if(l<r)
		{
			int mid=(l+r)/2;
			
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,r);
			merge(arr,l,mid,r);
			
		}
		
		
	}

	private static void merge(int[] arr, int l, int mid, int r) {
	
		int n1=mid-l+1;
		int n2=r-mid;
		
		int left[]=new int[n1];
		int right[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[l+i];
		}
		
		for(int j=0;j<n2;j++)
		{
			right[j]=arr[mid+l+j];
		}
		
		int i=0,j=0;
		
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(left[i]<right[i])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		
		
		while(i<n1)  
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
		
	}

}
