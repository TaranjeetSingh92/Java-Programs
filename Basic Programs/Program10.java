public class Program10 {
    public static void main(String args[])
    {
        int i=0,j=0,n=10;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j || j==n-i || i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
