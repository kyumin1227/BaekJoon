import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];

        // 배열 입력
        for (int[] i : array) {
            String[] str = br.readLine().split(" ");
            i[0] = Integer.parseInt(str[0]);
            i[1] = Integer.parseInt(str[1]);
        }

        // 배열 정렬
        Arrays.sort(array, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int[] i : array) {
            bw.write(i[0] + " " + i[1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
