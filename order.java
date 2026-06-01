class order
{
    private String itemName;
    private int total;

    order(String itemName,int total)
    {
        this.itemName=itemName;
        this.total=total;
    }

    public void orderDetails()
    {
        System.out.println("Ordered Item : "+itemName);
        System.out.println("Total Amount : "+total);
    }
}