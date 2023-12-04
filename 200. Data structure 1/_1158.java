import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            q.add(i + 1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");

        while(!q.isEmpty()) {
            for(int i = 1; i < K; i++) {
                q.add(q.remove());
            }
            bw.write(Integer.toString(q.remove()));

            if(!q.isEmpty()) bw.write(", ");
        }

        bw.write(">");

        bw.flush();
        bw.close();
    }
}
