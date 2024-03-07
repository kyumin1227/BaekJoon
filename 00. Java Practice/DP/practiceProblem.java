package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class practiceProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] whs = new int[N];
        int[] dp = new int[N];
        for (int i = 0; i < N; i++) {
            whs[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = whs[0];
        dp[1] = Math.max(dp[0], whs[1]);
        
        for (int i = 2; i < N; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + whs[i]);
        }

        System.out.println(dp[N - 1]);
    }
    /* 
    static int[] whs;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        whs = new int[N];
        dp = new int[N];
        for (int i = 0; i < whs.length; i++) {
            whs[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            max(i);
        }

        if (dp[N - 1] > dp[N - 2]) {
            System.out.println(dp[N - 1]);
        } else {
            System.out.println(dp[N - 2]);
        }
    }
    
    public static void max(int x) {
        if (x == 0) {
            dp[x] = whs[x];
        } else if (x == 1) {
            dp[x] = whs[x];
        } else {
            int num = dp[x - 2] + whs[x];
            if (num > dp[x - 1]) {
                dp[x] = num;
            }
        }   
    } */
}
