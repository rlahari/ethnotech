class usertwo extends machine
{
	usertwo(String name,int deposit,int withdraw,int balance)
	{
		super(name,deposit,withdraw,balance);
	}
	public String getname()
	{
		return name;
	}
	public void dodeposit()
	{
		super.dodeposit();
	}
	public void dowithdraw()
	{
		super.dowithdraw();
	}
	public void displaybalance()
	{
		super.displaybalance();
	}
}
class atm
{  
	public static void main(String args[])
	{
	machine m=new machine("lahari",1000,100,8000);
	System.out.println(m.getname());
	m.dodeposit();
	m.dowithdraw();
	m.displaybalance();
	userone u=new userone("madhu",2000,200,5000);
	System.out.println(u.getname());
	u.dodeposit();
	u.dowithdraw();
	u.displaybalance();
	usertwo u2=new usertwo("deekshi",3000,500,9000);
	System.out.println(u2.getname());
	u2.dodeposit();
	u2.dowithdraw();
	u2.displaybalance();
	}
}