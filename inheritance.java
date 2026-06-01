class Animal
{
	int animals;
	Animal(int animals)
	{
		this.animals=animals;
		System.out.println(animals);
	}
	//System.out.println(animals);
	void sound()
	{
		System.out.println("animal sound");
	}
	
}
class dog extends Animal
{
	dog(int animals)
	{
		super(animals);
		System.out.println(animals);
	
	}
	void sound()
	{
		System.out.println("barks");
	}
	//System.out.println(animals);
}
class cat extends Animal
{
	cat(int animals)
	{
		super(animals);
		System.out.println(animals);
	
	}
	void sound()
	{
		System.out.println("meow");
	}
	//System.out.println(animals);
}
class inheritance
{
	public static void main(String args[])
	{
		Animal obj1=new Animal(10);
		Animal obj2=new dog(3);
		Animal obj3=new cat(5);
		obj1.sound();
		obj2.sound();
		obj3.sound();
	}
}