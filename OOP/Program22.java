class Plane
{
    Plane()
    {
        System.out.println("Plane Zero Param Constructor");
    }
}
class Cargo extends Plane{
    //called automatically
    //	Cargo()
    //	{
    //		super();
    //	}
}
public class Program22 {
    public static void main(String[] args) {
        Cargo obj=new Cargo();
    }
    
}