class Demo1
{
    int a,b;
    Demo1()
    {
        System.out.println("Default cons demo1");
        a=10;b=20;
    }
    Demo1(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("Param Constructor demo1");
    }
}
class Demo2 extends Demo1{
    int x,y;
    Demo2()
    {
        this(1,2);
        x=10;
        y=20;
        System.out.println("Default cons demo2");
    }
    Demo2(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("Param Constructor demo2");
    }
    void disp()
	{
		System.out.println(a + " "+ b + " "+ x+ " "+ y);
	}
}
public class Program23 {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
		d.disp();   
    }
}
