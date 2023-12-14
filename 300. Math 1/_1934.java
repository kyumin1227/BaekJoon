import java.io.*;
import java.util.StringTokenizer;

public class _1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int num1C = num1;
            int num2C = num2;

            while (true) {
                if (num1C == num2C) {
                    bw.write(num1C + "\n");
                    break;
                } else if (num1C > num2C) {
                    num2C += num2;
                } else {
                    num1C += num1;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
