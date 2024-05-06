class Aeroplane
{
    int cost;
    void fly()
    {
        cost=4444;
        System.out.println("FLying");
    }
    void takeoff()
    {
        System.out.println("Taking off");
    }
}
class PassengerPlane extends Aeroplane
{
    //fly() is directly inherited (inherited method)
    void takeoff() //overriding method
    {
        System.out.println("Passeneger plane requires medium sized runway to take off taling off");
    }
    void disp()
	{
		System.out.println("Cost is "+ cost);
	}
}
public class Program21 {
    public static void main(String[] args) {
        Aeroplane p=new PassengerPlane();//upcasting
        p.fly();//Inherited method
        p.takeoff();//Overriding method
        //p.disp();//specialized method
    }
}

