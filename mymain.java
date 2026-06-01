public class mymain
{
    public static void main(String[] args)
    {
        
        restaurant r1=new restaurant("Pizza Hut","Cheese Pizza",299);

        r1.showMenu();
        System.out.println();
        customer c1=new customer(
                "Lahari",
                "9876543210",
                "Madanapalle"
        );
        c1.role();
        c1.placeOrder();
        System.out.println();
        order o1=new order(
                r1.getFoodItem(),
                r1.getPrice()
        );
        o1.orderDetails();
        System.out.println();
        user u;
        u=c1;
        u.role();

        
    }
}