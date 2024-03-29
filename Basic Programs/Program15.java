public class Program15 {
    public static void main(String[] args) {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 && i>0 && i< 3*(n-1)/4
                    || i==0 && j>0 && j< 3*(n-1)/4
                    || j==3*(n-1)/4 && i>0 && i<3*(n-1)/4
                    || i==3*(n-1)/4 && j>0 && j< 3*(n-1)/4
                    || i>=(n)/2 && j==i
                   )
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
