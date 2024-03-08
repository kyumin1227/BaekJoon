import java.math.BigInteger;
import java.util.Scanner;

public class _11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger[] dp = new BigInteger[n + 1];

        dp[0] = new BigInteger("0");
        dp[1] = new BigInteger("1");
        if (n > 1) {
            dp[2] = new BigInteger("2");
        }
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }

        BigInteger result = dp[n].remainder(new BigInteger("10007")); 
        
        System.out.println(result);
    }
}
