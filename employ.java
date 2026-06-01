class empone
{
	 void name()
	 {
		 System.out.println("Lahari");
	 }
	 void salary()
	 {
		 System.out.println("10000");
	 }
	
}
class emptwo extends empone
{
	void name()
	{
		super.name();
		System.out.println("ranesh");
	}
	void salary()
	{
		super.salary();
		System.out.println("5000");
	}
	void role()
	{
		System.out.println("Data analyst");
	}
}

class employ
{
	public static void main(String args[])
	{
		empone obj1=new empone();
		emptwo obj2=new emptwo();
		obj1.name();
		obj1.salary();
		obj2.name();
		obj2.salary();
		obj2.role();
		
	}
}