class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class linkedlistdemo1
{
    Node head;
    public void add(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {   
            curr=curr.next;
        }
        curr.next=newnode;
    }
    public void addfirst(int data)
    {
        Node newnode=new Node(data);
        
            newnode.next=head;
            head=newnode;
        
    }
    public void delfirst()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void dellast()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    
    }
    public void pos(int data,int posi)
    {
        Node newnode=new Node(data);
        if(posi==0)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        Node curr=head;
        for(int i=0;i<posi-1;i++)
        {
            if(curr==null)
            {
                System.out.println("Invalid position");
                return;
            }
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
    }
    public void delpos(int pos)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(pos==0)
        {
            head=head.next;
            return;
        }
        Node curr=head;
        for(int i=0;i<pos-1;i++)
        {
            if(curr.next==null)
            {
                System.out.println("invalid position");
                return;
            }
            curr=curr.next;
        }
        if(curr.next==null)
        {
            System.out.println("invalid position");
            return;
        }
        curr.next=curr.next.next;
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }   
        System.out.println("Null");
    }
    public static void main(String args[])
    {
       linkedlistdemo1 list=new linkedlistdemo1();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.display(); 
       System.out.println("after adding another element in the first of list");
       list.addfirst(5);
       list.display();
       System.out.println("after removing the first element");
       list.delfirst();
       list.display();
       System.out.println("after removing the last element");
       list.dellast();
       list.display();
       System.out.println("after inserting at specific position");
       list.pos(25,2);
       list.display();
       System.out.println("after deleting the element at specific position");
       list.delpos(2);
       list.display();
    }

}