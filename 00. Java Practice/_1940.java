import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1940 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열 생성
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        int answer = 0;

        // 이분탐색
        for (int i = 0; i < N; i++) {
            int targetNum = M - array[i];

            int s = 0;
            int e = N - 1;
            int m;
            boolean isGood = false;

            while (!(s > e)) {
                m = (int) Math.round((s + e) / 2.0);
                if (targetNum > array[m]) {
                    s = m + 1;
                } else if (targetNum < array[m]) {
                    e = m - 1;
                } else {
                    isGood = true;
                    break;
                }
            }

            if (isGood) {
                answer++;
            }
        }
        
        System.out.println(answer / 2);
    }
}
