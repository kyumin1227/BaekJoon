import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4108 {

    static int[][] board;   // 지뢰 판
    static int h, w;    // 지뢰 판의 높이와 넓이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());

            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            
            // 두 개의 값이 모두 0인 경우 종료
            if (h == 0 && w == 0) {
                break;
            }

            board = new int[h][w];

            // 입력을 받아 지뢰인 경우 주위의 값을 증가
            for (int y = 0; y < h; y++) {
                char[] line = br.readLine().strip().toCharArray();
                for (int x = 0; x < w; x++) {
                    if (line[x] == '*') {
                        board[y][x] = -9;
                        checkLandMine(x, y);
                    }
                }
            }

            // 출력
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (board[y][x] < 0) {
                        sb.append('*');
                    } else {
                        sb.append(board[y][x]);
                    }
                }
                sb.append('\n');
            }
        }

        System.out.print(sb);
        
    }

    // 주변의 값을 1 증가시키는 함수
    public static void checkLandMine(int argX, int argY) {
        
        for (int x = argX - 1; x < argX + 2; x++) {
            for (int y = argY - 1; y < argY + 2; y++) {
                // 범위에서 벗어났는지 확인
                if (x < 0 || y < 0 || x >= w || y >= h) {
                    continue;
                }
                board[y][x]++;  // 주변 값 1 증가
            }
        }

    }
} 