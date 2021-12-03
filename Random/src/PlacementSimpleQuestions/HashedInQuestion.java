package PlacementSimpleQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class HashedInQuestion {

	public static void main(String[] args) {
		
		int H[]= {6,5,2,1,8};
		int x=17;
		int y=5;
		int n=H.length;
	
		
		int res=calculateMaxCars(H,x,y,n);
		System.out.println(res);

	}

	private static int calculateMaxCars(int[] H, int x, int y,int n) {
		
		Arrays.sort(H);
		
		int visited[]=new int[H.length];
		
		int xSum=0;
		if(y<x)
		{
			int temp=x;
			x=y;
			y=temp;
		}
		for(int i=0;i<H.length;i++)
		{
			if(H[i]<x && xSum<=x)
			{
				xSum+=H[i];
				visited[i]=1;
				
			}
		}
		
		
		
		int ySum=0;
		for(int i=0;i<H.length;i++)
		{
			if(H[i]<x && ySum<=y && visited[i]!=1)
			{
				ySum+=H[i];
				visited[i]=1;
			}
		}
		int count=0;
		for(int i=0;i<visited.length;i++)
		{
			if(visited[i]==1)
			{
				count++;
			}
		}
		
		
		return count;
		
	
		
	}

}
