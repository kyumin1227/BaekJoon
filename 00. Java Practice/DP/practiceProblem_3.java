package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practiceProblem_3 {
    // 효율적인 화폐 구성
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] dp = new int[m + 1];
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i <= m; i++) {
            if (i > 0 && dp[i] == 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (i + coins[j] <= m) {
                    if (dp[i + coins[j]] == 0) {
                        dp[i + coins[j]] = dp[i] + 1;
                    }
                    dp[i + coins[j]] = Math.min(dp[i + coins[j]], dp[i] + 1);
                }
            }
        }

        if (dp[m] != 0) {
            System.out.println(dp[m]);
        } else {
            System.out.println("-1");
        }
    }
}
