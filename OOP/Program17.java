class Beta
{
    static int a;
    static{
        a=10;
        System.out.println("Static init block");
    }
    static void disp()
    {
        System.out.println(a);
    }
}
public class Program17 
{
    public static void main(String[] args) {
        Beta.disp();
        Beta b=new Beta();
        b.disp();
    }
}
