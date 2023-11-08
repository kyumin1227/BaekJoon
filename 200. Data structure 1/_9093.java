import java.io.*;

public class _9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] array = br.readLine().split(" ");

            for (int j = 0; j < array.length; j++) {
                StringBuilder sb = new StringBuilder(array[j]);
                bw.write(sb.reverse() + " ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}