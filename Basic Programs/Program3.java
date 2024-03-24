public class Program3 {
    public static void main(String args[])
    {
        int a=45;
        double b;
        b=a;//implicit typecasting or Numeric Type promotion
        System.out.println(a);
        System.out.println(b);

        double n1=45.6;
        int n2;
        n2=(int)n1;//Explicit Type casting
        System.out.println(n1);
        System.out.println(n2);

        int num1=45;
        byte num2=(byte)num1;
        System.out.println(num1);
        System.out.println(num2);

        int n3=129;
        byte n4=(byte)n3;  //-128 to 127
        System.out.println(n3);
        System.out.println(n4);//-127
    }
}
