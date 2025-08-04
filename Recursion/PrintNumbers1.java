public class PrintNumbers1 {
    public static void main(String[] args) {
        print(3);  // You can change 3 to any n
    }

    static void print(int n) {
        if (n < 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }
}
