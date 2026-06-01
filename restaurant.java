class restaurant
{
    private String restaurantName;
    private String foodItem;
    private int price;

    restaurant(String restaurantName,String foodItem,int price)
    {
        this.restaurantName=restaurantName;
        this.foodItem=foodItem;
        this.price=price;
    }

    public void showMenu()
    {
        System.out.println("Restaurant : "+restaurantName);
        System.out.println("Food Item : "+foodItem);
        System.out.println("Price : "+price);
    }

    public int getPrice()
    {
        return price;
    }

    public String getFoodItem()
    {
        return foodItem;
    }
}