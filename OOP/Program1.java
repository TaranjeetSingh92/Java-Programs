package OOP;
class Demo
{
    int avg;    //instance variable heap 
    int age;    //instance variable heap
    void disp() //stack
    {
        int num1=100; //local variable stack
        int num2=150;//local variable stack
        //avg=50;
        //age=33;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(avg);
        System.out.println(age);
    }
}
public class Program1
{
    public static void main(String args[]) //JVM will start from here //in stack area, stack frame created
    {
        Demo obj=new Demo(); 
        obj.disp();//stack frame created for demo()
    }//stack frame deleted , garbage collector will delete all refrences in heap
}
