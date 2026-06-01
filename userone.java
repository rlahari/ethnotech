class userone extends machine
{
	userone(String name,int deposit,int withdraw,int balance)
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