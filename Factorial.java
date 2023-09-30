public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long factorialIterative = calculateFactorialIterative(n);
        long factorialRecursive = calculateFactorialRecursive(n);

        System.out.println(n + "! (ciklussal): " + factorialIterative);
        System.out.println(n + "! (rekurzív): " + factorialRecursive);
    }

    public static long calculateFactorialIterative(int n) {
        if (n < 0) {
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calculateFactorialRecursive(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }
}
