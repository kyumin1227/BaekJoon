import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());      // 주어지는 정수의 개수
        int [] array = new int[N];
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        for(int i=0; i<N; i++) {                            // 입력 받은 값을 배열에 저장
            array[i] = Integer.parseInt(st.nextToken());
        }
        int countNum = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0; i<N; i++) {                            // 입력 받은 값을 countNum과 비교
            if(array[i]==countNum)
                count+=1;
        }
        System.out.println(count);
    }
}
