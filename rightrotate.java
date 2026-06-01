import java.util.*;
public class rightrotate
{
	public static void swap(int[] arr,int start,int end)
	{
		//int start=0;
		//int end=arr.length-1;
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	public static void rotate(int[] arr,int k)
	{ 
		int n=arr.length;
		k=k%n;
		swap(arr,0,n-1);
		swap(arr,0,k-1);
		swap(arr,k,n-1);
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		rotate(arr,k);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}