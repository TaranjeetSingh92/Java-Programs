public class Program16 {
 public static void main(String args[])
 {
    int n=15;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            //if(j==0 || i==j ||i==n-1)
            //if(j<=i)
            //if(j+i<=n-1)
            //if(i+j==n/2 || i==n/2 || j-i==n/2)
            if(i-j<=n/2 && j+i<=3*(n/2) && i>=n/2)
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
