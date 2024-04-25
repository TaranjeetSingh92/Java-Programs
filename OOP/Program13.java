class Alpha
{
    int a,b;
    Alpha()
    {
        this(44);
        System.out.println("Zero Param constructor");
        a=10;
        b=20;
    }
    Alpha(int x)
    {
        System.out.println("One param constructor");
        a=x;
    }
    Alpha(int x,int y)
    {
        System.out.println("Two Param Constructor");
        a=x;
        b=y;   
    }
    void disp()
	{
		System.out.println(a);
		System.out.println(b);
	}
}

public class Program13 {
    public static void main(String[] args) {
        Alpha alpha1=new Alpha();
		alpha1.disp();
		
		Alpha alpha2=new Alpha(2,1);
		alpha2.disp();   
    }
}
