import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _29733 {

    static int[][][] board;   // 지뢰 판
    static int h, w, d;    // 지뢰 판의 높이와 넓이, 차원

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        StringBuilder sb = new StringBuilder();

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        board = new int[d][h][w];

        // 입력을 받아 지뢰인 경우 주위의 값을 증가
        for (int z = 0; z < d; z++) {
            for (int y = 0; y < h; y++) {
                char[] line = br.readLine().strip().toCharArray();
                for (int x = 0; x < w; x++) {
                    if (line[x] == '*') {
                        board[z][y][x] = -15;
                        checkLandMine(x, y, z);
                    }
                }
            }
        }   

        // 출력
        for (int z = 0; z < d; z++) {
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (board[z][y][x] < 0) {
                        sb.append('*');
                    } else {
                        sb.append(board[z][y][x] % 10);
                    }
                }
                sb.append('\n');
            }
        }

        System.out.print(sb);
            
    }

    // 주변의 값을 1 증가시키는 함수
    public static void checkLandMine(int argX, int argY, int argZ) {
        
        for (int z = argZ - 1; z < argZ + 2; z++) {
            for (int x = argX - 1; x < argX + 2; x++) {
                for (int y = argY - 1; y < argY + 2; y++) {
                    // 범위에서 벗어났는지 확인
                    if (x < 0 || y < 0 || z < 0 || x >= w || y >= h || z >= d) {
                        continue;
                    }
                    board[z][y][x]++;  // 값 1 증가
                }
            }
        }
    }
} 
