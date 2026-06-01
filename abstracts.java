abstract class foodorder {

    String name;
    int quantity;
    int price;
	abstract void  hello();

    foodorder(String var1, int var2, int var3) {
        this.name = var1;
        this.quantity = var2;
        this.price = var3;
    }

    abstract void instamart();
        
    

    void showName() {
        System.out.println("name: " + this.name);
    }

    void showQuantity() {
        System.out.println("quantity: " + this.quantity);
    }

    void showPrice() {
        System.out.println("price: " + this.price);
    }

    void display() {
        showName();
        showQuantity();
        showPrice();
    }
	
}

class delivery extends foodorder {

    delivery(String var1, int var2, int var3) {
        super(var1, var2, var3);
    }
	//override
	void instamart() {
        System.out.println("order any thing in instamart");
    }

    void showName() {
        System.out.println("name: " + this.name);
    }

    void showQuantity() {
        System.out.println("quantity: " + this.quantity);
    }

    void showPrice() {
        System.out.println("price: " + this.price);
    }
	void hello()
	{
		System.out.println("hello");
	}
}


class abstracts {

    public static void main(String[] args) {

        delivery ob = new delivery("lahari", 1, 500);

        ob.instamart();
        ob.showName();
        ob.showPrice();
		ob.showQuantity();
		ob.hello();
		
    }
}