class Demo{
    static int x,y;
    int a,b;
    static{
        x=10;
        y=20;
        System.out.println("Static block");
    }
    {
        a=100;
        b=200;
        System.out.println("Java initialization block(non static block)");
    }
    Demo()
    {
        System.out.println("Zero Param constructor");
    }
    static void disp(){
        System.out.println(x);
        System.out.println(y);
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}
public class Program16 {
    public static void main(String[] args) {
        Demo.disp();
        Demo d=new Demo();
        d.show();
    }
}
