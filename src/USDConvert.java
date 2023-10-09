import java.util.Scanner;

public class USDConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD amount");
        double usd = scanner.nextDouble();
        final int RATE = 23000;
        System.out.println("Result: " + RATE*usd);
    }
}
