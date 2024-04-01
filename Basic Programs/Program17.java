public class Program17 {
    public static void main(String args[])
 {
    int n=15;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(j+i<=n/2 || i-j>=n/2 || j-i>=n/2 || j+i>=3*(n/2))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("   ");
        for(int j=0;j<n;j++)
        {
            if(j+i>=n/2 && i<=n/2 && j<=n/2
            || i-j<=n/2 && i>=n/2 && j<=n/2
            || i+j<=3*(n/2) && i>=n/2 && j>=n/2
            || i<=n/2 && j>=n/2 && j-i<=n/2)
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
