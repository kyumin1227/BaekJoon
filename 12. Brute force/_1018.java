import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min;

        // 배열에 할당
        String[][] colorArray = new String[M][N];
        for (int i = 0; i < N; i++) {
            s = bf.readLine();
            colorArray[i] = s.split("");
        }

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int count = 0;
                // 8 * 8 체크
                for (int ii = 0; ii < 8; ii++) {
                    for (int jj = 0; jj < 8; jj++) {
                        if (colorArray[i + ii][j + jj] == "B") {
                            
                        }
                    }
                }
            }
        }

    }
}
