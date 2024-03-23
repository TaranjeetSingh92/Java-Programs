public class Program2 {
    public static void main(String[] args) {
    char ch='a'; //2 bytes
    System.out.println(ch);
    byte n1=45; //-128 to 127  ===> 1 byte
    System.out.println(n1);
    short n2=32767;//-32768 to 32767 ===> 2 bytes
    System.out.println(n2);
    int num=2147483647; //-2147483648 to 2147483647  ==> 4 bytes 
    System.out.println(num);
    long l=4545454554l; // 8 bytes
    System.out.println(l);
    }
}
