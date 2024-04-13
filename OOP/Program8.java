//this keyword-Stores address of current object
class Student
{
    private String name;
    private int age;
    private double avg;

    void setData(String name,int age,double avg)
    {
        this.name=name;
        this.age=age;
        this.avg=avg;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setAge(int age)
    {
        this.age=age;
    }
    String getName()
	{
		return name;
	}
	
	int getAge()
	{
		return age;
	}
	
	double getAvg()
	{
		return avg;
	}

}
public class Program8 {
    public static void main(String[] args) {
    Student obj1=new Student();
    obj1.setName("abc");
    obj1.setAge(89);
    obj1.setData("XYZ", 56, 55);

        String n=obj1.getName();
		System.out.println(n);
		System.out.println(obj1.getAge());
		System.out.println(obj1.getAge());

		System.out.println("**************************************");
		Student st2=new Student();
		st2.setData("Rohit", 22, 22.5);
		System.out.println(st2.getName());
		System.out.println(st2.getAge());
		System.out.println(st2.getAvg());
    }

}
