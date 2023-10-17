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

        int min = 64;

        // 배열에 할당
        String[][] colorArray = new String[N][M];
        for (int i = 0; i < N; i++) {
            s = bf.readLine();
            colorArray[i] = s.split("");
        }

        loopOut:
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countW = 64; // W 시작
                int countB = 64; // B 시작
                // 8 * 8 체크
                for (int ii = 0; ii < 8; ii++) {
                    for (int jj = 0; jj < 8; jj++) {
                        if (colorArray[i + ii][j + jj].equals("B") && (ii + jj + 1) % 2 == 0) {
                            countW -= 1;
                        }
                        if (colorArray[i + ii][j + jj].equals("W") && (ii + jj + 1) % 2 == 1) {
                            countW -= 1;
                        }
                        if (colorArray[i + ii][j + jj].equals("W") && (ii + jj + 1) % 2 == 0) {
                            countB -= 1;
                        }
                        if (colorArray[i + ii][j + jj].equals("B") && (ii + jj + 1) % 2 == 1) {
                            countB -= 1;
                        }
                    }
                }
                if (countW <= min) {
                    min = countW;
                }
                if (countB <= min) {
                    min = countB;
                }
                if (min == 0) {
                    break loopOut;
                }
            }
        }
            System.out.println(min);
    }
}
