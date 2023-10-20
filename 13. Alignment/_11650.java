import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] array = new int[N][2];
        for (int i = 0; i < array.length; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j][0] > array[j + 1][0]) {
                    int num1 = array[j][0];
                    int num2 = array[j][1];
                    array[j][0] = array[j + 1][0];
                    array[j][1] = array[j + 1][1];
                    array[j + 1][0] = num1;
                    array[j + 1][1] = num2;
                } else if (array[j][0] == array[j + 1][0] && array[j][1] > array[j + 1][1]) {
                    int num1 = array[j][0];
                    int num2 = array[j][1];
                    array[j][0] = array[j + 1][0];
                    array[j][1] = array[j + 1][1];
                    array[j + 1][0] = num1;
                    array[j + 1][1] = num2;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i][0] + " " + array[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
