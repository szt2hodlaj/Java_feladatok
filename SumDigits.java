import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérjük, adjon meg egy pozitív egész számot: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Érvénytelen bemenet. Az számnak pozitívnak kell lennie.");
        } else {
            int sum = calculateDigitSum(n);
            System.out.println("A számjegyek összege: " + sum);
        }
    }

    public static int calculateDigitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int sumOfRemainingDigits = calculateDigitSum(remainingDigits);
            return lastDigit + sumOfRemainingDigits;
        }
    }
}
