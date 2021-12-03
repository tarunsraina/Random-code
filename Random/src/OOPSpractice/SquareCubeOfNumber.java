package OOPSpractice;

import java.util.ArrayList;

class SquareCubePair
{
	int square;
	int cube;
}
public class SquareCubeOfNumber {
	
	public static void main(String[] args) {

		int arr[]= {2,3,4,5,6};
		ArrayList<SquareCubePair> SqCubePair=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			SquareCubePair obj=new SquareCubePair();
			obj.square=arr[i]*arr[i];
			obj.cube=obj.square*arr[i];
			SqCubePair.add(obj);
		}
		
		for(int i=0;i<SqCubePair.size();i++)
		{
			System.out.print("Number:"+arr[i]+"->");
			System.out.print("Square:"+SqCubePair.get(i).square+",");
			System.out.println("Cube:"+SqCubePair.get(i).cube);
			
		}

	}

}
