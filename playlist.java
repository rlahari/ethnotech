import java.util.*;
class playlist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many songs you want");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str=sc.nextLine();
            list.add(str);
        }
        System.out.println("the available songs are "+list);
        list.add("memories");
        System.out.print("deleted song is");
        list.remove(0);
        Syste
        for(String str:list)
        {
            System.out.println(str);
        }
    }
}