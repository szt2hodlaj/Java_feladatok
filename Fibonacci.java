public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci (" + n + ") iteratív: " + fibonacci(n));
        System.out.println("Fibonacci (" + n + ") rekurzív: " + fibonacciRec(n));
    }

    public static long fibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        long prev1 = 0;
        long prev2 = 1;
        long result = 0;
        for (int i = 2; i <= n; i++) {
            result = prev1 + prev2;
            prev1 = prev2;
            prev2 = result;
        }
        return result;
    }

    public static long fibonacciRec(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1) {
            return n;
        }
        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }
}
