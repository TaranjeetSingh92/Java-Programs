class Employee
{
    private String name;
    private int age;
    private String city;
    private double salary;

    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public double getSalary()
    {
        return salary;
    }

}

public class Program9 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setName("Taran");
        e1.setAge(51);
        e1.setSalary(10000000);
        e1.setCity("XYZ");
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        System.out.println(e1.getCity());
    }   
}
