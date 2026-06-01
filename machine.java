class machine
{
	String name;
	int deposit;
	int withdraw;
	int balance;
	machine(String name,int deposit,int withdraw,int balance)
	{
		this.name=name;
		this.deposit=deposit;
		this.withdraw=withdraw;
		this.balance=balance;
	}
	public String getname()
	{
		return name;
	}
	public void dodeposit()
	{
		balance+=deposit;
		System.out.println(balance);
	}
	public void dowithdraw()
	{
		balance-=withdraw;
		System.out.println(balance);
	}
	public void displaybalance()
	{
		System.out.println(balance);
	}
}
