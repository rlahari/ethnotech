import java.util.*;
public class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,arr[i]);
        }
        System.out.println("max temperature:"+maxi);
        int mini=Integer.MAX_VALUE;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>35)
            {
                count++;
            }
            sum=sum+arr[i];
            mini=Math.min(mini,arr[i]);
        }
        System.out.println("min temperature:"+mini);
        float avg=sum/n;
        System.out.println("average is:"+avg);
        System.out.println("no of hot days:"+count);
        
    }
}