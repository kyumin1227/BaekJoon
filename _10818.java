import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());            // 첫째줄 N = 주어지는 정수의 개수

        String s = br.readLine();
        int numMax = -100000000, numMin = 100000000;        // 어떤값이 들어와도 받을 수 있도록 최댓값에는 최솟값을 반대로 최솟값에는 최댓값을 지정
        int[] array = new int[N];                           // 정수의 개수 만큼 배열을 생성
        StringTokenizer st = new StringTokenizer(s);
        for(int i = 0; i<N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
            if(array[i]>numMax)                             // array[i]가 최대값보다 클 경우 array[i]를 최대값으로 변경
                numMax = array[i];
            if(array[i]<numMin)                             // array[i]가 최소값보다 작을 경우 array[i]를 최소값으로 변경
                numMin = array[i];
        }
        bw.write(Integer.toString(numMin)+" "+Integer.toString(numMax));
        bw.flush();
        bw.close();
        
    }
}
