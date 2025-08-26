import java.util.*; 
public class TrainJourney {

    public static int countWays(int n) {
        // Base cases
        if (n == 0) return 1;
        if (n == 1) return 1;  
        int[] dp = new int[n + 1];
        dp[0] = 1; 
        dp[1] = 1; 
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt(); 
        System.out.println("Total distinct ways to reach station " + n + " = " + countWays(n));
        sc.close();
    }
}
