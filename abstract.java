abstract class foodorder {

    String name;
    int quantity;
    int price;

    foodorder(String var1, int var2, int var3) {
        this.name = var1;
        this.quantity = var2;
        this.price = var3;
    }

    void zomato() {
        System.out.println("welcome to zomato");
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

    void confirmation() {
        System.out.println("order confirmed");
    }
}

class abstracts {

    public static void main(String[] args) {

        delivery ob = new delivery("deekshi", 1, 250);

        ob.zomato();
        ob.confirmation();
        ob.display();
    }
}