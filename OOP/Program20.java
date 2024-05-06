//Inheritance 
class Alpha
{
    void disp()
    {
        System.out.println("Disp method of alpha class");
    }
}
class Beta extends Alpha{

}

class Gamma extends Alpha{

}
public class Program20 {
    public static void main(String[] args) {
        Beta beta=new Beta();
		beta.disp();
		
		Gamma gamma=new Gamma();
		
		gamma.disp();
    }
}
