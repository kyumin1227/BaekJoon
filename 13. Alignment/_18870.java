import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    // 좌표 수
        int[] array = new int[N];   // 좌표 배열
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);

        // 배열 입력
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        int[] sortArray = Arrays.stream(array).distinct().toArray();    // 중복을 제거한 배열
        Arrays.sort(sortArray); // 중복 제거한 배열 정렬

        // 값을 중복을 제거한 배열에서 찾은 후 해당 값의 index를 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < sortArray.length; j++) {
                if (array[i] == sortArray[j]) {
                    bw.write(j + " ");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
