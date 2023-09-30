import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérjük, adja meg a 'a' értékét (nem lehet nulla): ");
        double a = scanner.nextDouble();
        System.out.print("Kérjük, adja meg a 'b' értékét: ");
        double b = scanner.nextDouble();
        System.out.print("Kérjük, adja meg a 'c' értékét: ");
        double c = scanner.nextDouble();

        calculateAndPrintQuadraticRoots(a, b, c);
    }

    public static void calculateAndPrintQuadraticRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("'a' nem lehet nulla.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Két valós gyök: x1 = " + root1 + ", x2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Egy valós gyök: x = " + root);
        } else {
            System.out.println("Nincs valós gyök.");
        }
    }
}
