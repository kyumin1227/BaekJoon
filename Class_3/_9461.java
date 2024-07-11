import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _9461 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] dp = new long[101];
        
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;

        for (int i = 5; i < 101; i++) {
            dp[i] = dp[i - 1] + dp[i - 5];
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(Long.toString(dp[n]) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}