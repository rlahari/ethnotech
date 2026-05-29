import java.util.*;
public class billing
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cost=0;
		if(n>250)
		{
			cost=n-250;
		}
		else
		{
			cost=0;
		}
		System.out.println(cost);
	}
}