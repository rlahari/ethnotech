class customer extends user
{
    private String address;

    customer(String name,String phone,String address)
    {
        super(name,phone);
        this.address=address;
    }

    public String getAddress()
    {
        return address;
    }

    // Overriding
    @Override
    public void role()
    {
        System.out.println(getName()+" is a Customer");
    }

    public void placeOrder()
    {
        System.out.println(getName()+" placed an order");
    }
}