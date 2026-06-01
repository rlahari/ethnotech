interface User
{
    void chooseRide();
    int rideCost();
}

class Auto implements User
{
    public void chooseRide()
    {
        System.out.println("Booked Auto");
    }

    public int rideCost()
    {
        return 180;
    }
}

class Bike implements User
{
    public void chooseRide()
    {
        System.out.println("Booked Bike");
    }

    public int rideCost()
    {
        return 80;
    }
}

class Cab implements User
{
    public void chooseRide()
    {
        System.out.println("Booked Cab");
    }

    public int rideCost()
    {
        return 30;
    }
}

 class Uber
{
    public static void main(String args[])
    {
        User auto = new Auto();
        User bike = new Bike();
        User cab = new Cab();

        System.out.println("Auto Cost : " + auto.rideCost());
        System.out.println("Bike Cost : " + bike.rideCost());
        System.out.println("Cab Cost  : " + cab.rideCost());

        if(auto.rideCost() < bike.rideCost() &&
           auto.rideCost() < cab.rideCost())
        {
            System.out.println("\nCheapest Ride:");
            System.out.print(auto.rideCost());
            auto.chooseRide();
        }
        else if(bike.rideCost() < cab.rideCost())
        {
            System.out.println("\nCheapest Ride:");
            System.out.print(bike.rideCost());
            bike.chooseRide();
        }
        else
        {
            System.out.print("\nCheapest Ride:");
            System.out.println(cab.rideCost());
            cab.chooseRide();
        }
    }
}