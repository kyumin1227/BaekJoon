package DP;

import java.io.IOException;
import java.util.Scanner;

public class practiceProblem_2 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        dp = new int[x + 1];

        cal(x);
        System.out.println(dp[1]);
    }
    
    public static void cal(int x) {
        if (x == 1) {

        } else {
            int num = 0;
            // // 5로 나누기
            if (x % 5 == 0) {
                num = x / 5;
                if (dp[num] == 0 || dp[num] > dp[x] + 1) {
                    dp[num] = dp[x] + 1;
                }
                cal(num);
            }

            // 3으로 나누기
            if (x % 3 == 0) {
                num = x / 3;
                if (dp[num] == 0 || dp[num] > dp[x] + 1) {
                    dp[num] = dp[x] + 1;
                }
                cal(num);
            }

            // 2로 나누기
            if (x % 2 == 0) {
                num = x / 2;
                if (dp[num] == 0 || dp[num] > dp[x] + 1) {
                    dp[num] = dp[x] + 1;
                }
                cal(num);
            }

            num = x - 1;
            if (dp[num] == 0 || dp[num] > dp[x] + 1) {
                dp[num] = dp[x] + 1;
            }
            cal(num);
        }
    }
}
