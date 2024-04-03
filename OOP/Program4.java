package OOP;
class Calc
{
    int add()
    {
        return 10;
    }
    int add(int x,int y)
    {
        return x+y;
    }
    int add(int x,int y,int z)
    {
        return x+y+z;
    }
    double add(double x,double y)
    {
        return x+y;
    }
    double add(int x,double y)
    {
        return x+y;
    }
    double add(double x,int y)
    {
        return x+y;
    }
    double add(double x, double y, double z)
    {
    	return x+y+z;
    }
    double add(int x, double y, double z)
    {
    	return x+y+z;
    }
}
public class Program4
{
    public static void main(String[] args) {
        Calc c=new Calc();
        System.out.println(c.add(10,  20));
		System.out.println(c.add(10, 10.5));
		System.out.println(c.add(1, 2,3));
		System.out.println(c.add(1.1, 2.2, 3.3));
    }
}
