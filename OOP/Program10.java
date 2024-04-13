//Constructor
class Student
{
    private String name;
    private int age;
    private double avg;
    Student(String name,int age,double avg)
    {
        this.name=name;
        this.age=age;
        this.avg=avg;
    }
    public int getage()
    {
        return age;
    }
    public double getavg()
    {
        return avg;
    }
    public String getName()
    {
        return name;
    }
}

public class Program10 {
    public static void main(String[] args) {
    Student s1=new Student("Taran",15, 30.5);
    System.out.println(s1.getName());
    System.out.println(s1.getage());
    System.out.println(s1.getavg());            
    }
}
