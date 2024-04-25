class Demo{
    int x;
    double y;
    Demo()
    {
        System.out.println("Default constructor");
    }
    Demo(int x,double y)
    {
        this();
        this.x=x;
        this.y=y;
    }
    void disp()
	{
	    System.out.println(x);
	    System.out.println(y);
	}
}

public class Program12 {
    public static void main(String args[])
    {
        Demo d1=new Demo();
        Demo d2=new Demo(12,44.567);
        d1.disp();
        d2.disp();
    }
}
