public class FibonacciRecursive {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci at position " + n + ": " + fib(n));
    }

    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
