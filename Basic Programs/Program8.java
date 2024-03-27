public class Program8 {
    public static void main(String[] args) {
        int n1=30;
        int n2=35;
        int res=0;
        res=(n1>n2)?n1:n2;
        System.out.println(res);
        String str=(n1>n2)?"true":"false";
        System.out.println(str);

        int a=10;
        int b=11;
        int c=12;
        res=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(res);
    }
}
