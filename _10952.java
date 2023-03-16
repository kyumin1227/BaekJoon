import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class _10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a, b;
        while(true) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a==0 && b==0)                               //a값과 b값 모두 0이라면 반복문을 중지 후 출력
                break;
            bw.write(a+b+"\n");                             //모두 0이 아니라면 a+b값을 저장하고 줄을 넘김
        }
        bw.flush();
        bw.close();
    }
}
