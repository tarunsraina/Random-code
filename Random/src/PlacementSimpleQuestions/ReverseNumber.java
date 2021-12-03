package PlacementSimpleQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n=-123;
		if(n<0)
		{
			String num=n+"";
			String num1=num.substring(1);
			StringBuilder sb=new StringBuilder(num1);
			sb.reverse();
			String res="-"+sb;
			System.out.println(Integer.parseInt(res));
		}
		else
		{
			String num=n+"";
			StringBuilder sb=new StringBuilder(num);
			sb.reverse();
			String res=sb+"";
			System.out.println(Integer.parseInt(res));
		}

	}

}
