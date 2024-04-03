package OOP;
class Calc2
{
	
  
    double add(double x, int y)
    {
    	return x+y;
    }
    
//    void add(double x, int y)
//    {
//    	System.out.println("no return statement");
//    }
//    double add(int x, double y)
//    {
//    	return x+y;
//    }
    
//    int add(int x, int y)
//    {
//    	return x+y;
//    }
    
    //Method overloading refers to creating multiple methods with same name and diff parameters within same class.
}
public class Program3 {

	public static void main(String[] args) {
		
		Calc2 c2=new Calc2();
        double result;
		result=c2.add(10, 4);
        System.out.println(result);

	}

}
