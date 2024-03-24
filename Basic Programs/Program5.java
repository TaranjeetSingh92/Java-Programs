public class Program5 {
    public static void main(String args[])
    {
        System.out.println(30%100);//30
		System.out.println(20%2);//0
		System.out.println(2%20);//2

        int a=12;
        int b=5;
        float c=a/b; //2.0
        float d=(float)a/b; //2.4
        System.out.println(c);
        System.out.println(d);

        byte n1=10;
        byte n2=5;
        //byte res=(byte)n1+n2; //error
        int res=n1+n2;
        System.out.println(res);


    }
}
