public class test {
    public static void main(String[] args) {
       int a = 5, b = 0;
       if ( a == 5) {
           ++a;
           b = a++ * 5;
       }
        System.out.println(a);
        System.out.println(b);
    }
}
