//Count Number of objects using static
class Gama
{
    static int count;
    {
        count++;
    }
    Gama()
    {

    }
    Gama(int a)
    {

    }
    Gama(int a,int b)
    {

    }
}
public class Program18 {
    public static void main(String[] args) {
        Gama obj1=new Gama();
        System.out.println("Number of objects created="+Gama.count);
        Gama obj2=new Gama(1);
        System.out.println("Number of objects created="+Gama.count);
        Gama obj3=new Gama(2,3);
        System.out.println("Number of objects created="+Gama.count);
    }
}
