import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st1.nextToken());
        }

        Arrays.sort(array);

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int[] array2 = new int[M];
        for (int i = 0; i < M; i++) {
            array2[i] = Integer.parseInt(st2.nextToken());
        }

        int targetNum;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i = 0; i < array2.length; i++) {
            targetNum = array2[i];

            int s = 0;
            int e = array.length - 1;
            int m;
            boolean isExist = false;

            while (!(s > e)) {
                m = (int) Math.round((s + e) / 2.0);
                if (targetNum < array[m]) {
                    e = m - 1;
                } else if (targetNum > array[m]) {
                    s = m + 1;
                } else {
                    isExist = true;
                    break;
                }
            }

            if (isExist) {
                bw.write(1 + " ");
            } else {
                bw.write(0 + " ");
            }

        }
        
        bw.flush();
        bw.close();

    }
}
