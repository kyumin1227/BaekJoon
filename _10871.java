import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());               // 입력 받을 정수의 개수
        int standard = Integer.parseInt(st.nextToken());        // 비교를 위한 기준 수
        s = br.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
            if(array[i] < standard) {
                bw.write(array[i]+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
