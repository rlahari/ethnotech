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
        return 300;
    }
}

public class Uber
{
    public static void main(String args[])
    {
        User auto = new Auto();
        User bike = new Bike();
        User cab = new Cab();

        System.out.println("Auto Cost : " + auto.rideCost());
        System.out.println("Bike Cost : " + bike.rideCost());
        System.out.println("Cab Cost  : " + cab.rideCost());

        User cheapest = auto;

        if(bike.rideCost() < cheapest.rideCost())
        {
            cheapest = bike;
        }

        if(cab.rideCost() < cheapest.rideCost())
        {
            cheapest = cab;
        }

        System.out.println("\nCheapest Ride:");
        cheapest.chooseRide();
        System.out.println("Cost = " + cheapest.rideCost());
    }
}