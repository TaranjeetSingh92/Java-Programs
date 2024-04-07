package OOP;
//Overloading main method
public class Program6 {
    public static void main(String[] args) {
        System.out.println("String[] args");
        main("String args");
        main(10);
        int arr[]={1,2,3,4,5};
        main(arr);
    }
    public static void main(String args) {
        System.out.println("String args");
    }
    public static void main(int args) {
        System.out.println("Int args");
    }
    public static void main(int args[]) {
        System.out.println("Int args[]");
    }
}
