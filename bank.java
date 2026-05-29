class bank
{
	private int accno;
	private String name;
	private int balance;
	private int deposit;
	public void setdetails(int accno,String name,int balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		
	}
	public int getaccno()
	{
		return accno;
	}
	public String getname()
	{
		return name;
	}
	public int totalbalance(int deposit)
	{
		return balance+deposit;
	}
	public static void main(String args[])
	{
		bank b=new bank();
		b.setdetails(1234,"lahari",1000);
		System.out.println(b.getaccno());
		System.out.println(b.getname());
		System.out.println("after depositing the money the total balance is");
		System.out.println(b.totalbalance(5000));
		
		
	}
}