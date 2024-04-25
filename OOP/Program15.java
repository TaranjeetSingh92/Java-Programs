class Alpha{
    static int a;
    static 
    {
        System.out.println("Static block of alpha");
    }
    static void disp()
    {
        System.out.println("Static method of alpha");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Alpha.disp();
        System.out.println("Main Method");
    }
}

