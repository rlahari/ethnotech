class user
{
    private String name;
    private String phone;

    user(String name,String phone)
    {
        this.name=name;
        this.phone=phone;
    }

    
    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    
    public void role()
    {
        System.out.println("User of Swiggy");
    }
}