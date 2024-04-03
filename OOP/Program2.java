package OOP;
class Calculator
{
    int num1,num2,res;
    //return type has no effect in overloading
    void add()
    {
        num1=10;
        num2=20;
        res=num1+num2;
        System.out.println(res);
    }
    int add(int x,int y)
    {
        num1=x;
        num2=y;
        res=num1+num2;
        return res;
    }
   /*
   Duplicate Method error
   void add(int x,int y)
    {

    }
   */ 
}
public class Program2 {
    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        cal.add();
        System.out.println(cal.add(25,33));        
    }
}
