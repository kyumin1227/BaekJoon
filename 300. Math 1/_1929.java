import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true;

        for (int i = 2; i <= N / 2; i++) {
            int num = i;
            while (true) {
                num += i;
                if(num > N) break;
                prime[num] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if(!prime[i]) System.out.println(i);
        }
    }
}
