public class Program9 {
    public static void main(String args[])
    {
        int n=5;
        int i=0;int j=0;
        for(i=0; i<n; i++)
	    {
			for(j=0;j<n;j++)
			{
				//if(i==0 || i==n-1 || j==0 || j==n-1)
				//if(i==0 ||i==n-1 ||j==0)
                //if(i==0 || j==n/2)
                //if(i==0 || j==0 || i==n/2 || i==n-1)
               // if(j==0 || i==n/2 || j==n-1 || i==0)
                //if(j!=0 && i==n-1 || j!=0 && i==0 || j==0 && i!=0 && i!=n-1)
                /*if(j!=0 && i==n-1 && j!=n-1
                    || j!=0 && i==0 && j!=n-1
                    || j==0 && i!=0 && i!=n-1 
                    || j==n-1 && i!=0 && i!=n-1)*/
                   if(j==0 || i==0 && j>0 && j<n-1
                    || i==n-1 && j<n-1
                    || j==n-1 &&  i>0 && i<n-1) 
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
