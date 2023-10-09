import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = scanner.nextFloat();

        System.out.println("Enter b: ");
        b = scanner.nextFloat();

        System.out.println("Enter c: ");
        c = scanner.nextFloat();

        if (a == 0 ) {
            if (c - b == 0) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        } else {
            float answer = (c - b)/a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        }

    }
}
