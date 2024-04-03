package OOP;
class Stackoverflow
{
    //static int i;
    int i=0;
    void disp()
    {
        System.out.println("hola: "+i);
        i++;
        disp();
        
    }
}
public class Program6 {
    public static void main(String[] args) {
        Stackoverflow obj=new Stackoverflow();
        obj.disp();
    }
}
