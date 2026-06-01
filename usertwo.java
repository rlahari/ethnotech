class usertwo extends machine
{
	usertwo(int deposit,int withdraw,int balance)
	{
		super(deposit,withdraw,balance)
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
	machine m=new machine(1000,100,8000);
	userone u=new userone(2000,200,5000);
	u.dodeposit();
	u.dowithdraw();
	u.displaybalance();
	usertwo u2=new usertwo(3000,500,9000);
	u2.dodeposit();
	u2.dowithdraw();
	u2.displaybalance();
}