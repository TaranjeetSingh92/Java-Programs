public class Program4 {
    public static void main(String args[])
    {
  /*
        int a=4;
        int b;
        b= a++ + ++a;
        System.out.println(a);//6
        System.out.println(b);//10

        int a1=5;
        int b1;
        b1=++a + ++a + a++; 
        System.out.println(a1);//8
        System.out.println(b1);//20

     
        int a=4;
        int b;
        b=++a + --a + a++ + a--; //5 4 
        System.out.println(a);//4
        System.out.println(b);//18
 
		int a=4;
		int b;
		b=a++ + --a + --a + a++ + ++a - a--; //4 4 3 3 5 5
		System.out.println(a);//4
		System.out.println(b);//14
*/
        int a=4;
        int b;
        b=a++ + ++a + a++ - --a + --a + a++ + a--; //4 6 6 6 5 5 6
        System.out.println(a);//5
        System.out.println(b);//26

    }
}
