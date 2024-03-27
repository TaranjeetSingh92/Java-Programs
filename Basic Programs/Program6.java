public class Program6 {
    public static void main(String[] args) {
        int num1=10;
        int num2=15;
        int res=0;
  /*      if(num1<num2)
        {
            res=num1+num2;
            System.out.println(res);
        }
        else
        {
            res=num1-num2;
            System.out.println(res);
        }
        */
        num1=20;
        num2=10;
        if(num1<num2 && num1<=num2)
        {
            if(num1<num2)
            {
                res=num1-num2;
                System.out.println(res);
            }
            else
            {
                res=num1+num2;
                System.out.println(res);
            }
        }
        else if(num1>num2)
        {
            res=num1/num2;
            System.out.println(res);
        }
        else
        {
            res=num2*num1;
            System.out.println(res);
        }


    }
}
