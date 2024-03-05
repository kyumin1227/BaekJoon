import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _17087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 동생 수
        int s = Integer.parseInt(st.nextToken());   // 현재 위치
        
        int[] array = new int[n]; // 동생 위치 배열
        
        String nums = br.readLine();
        StringTokenizer st2 = new StringTokenizer(nums);
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st2.nextToken());
        }
        
        Arrays.sort(array);

        int[] difs = new int[n];    // 각 위치들의 거리를 나타낸 배열

        if (s > array[0]) {
            difs[0] = s - array[0];
        } else {
            difs[0] = array[0] - s;
        }
        
        for (int i = 1; i < difs.length; i++) {
            difs[i] = array[i] - array[i - 1];
        }

        Arrays.sort(difs);
        
        int max;
        // 값이 하나밖에 없다면 최대값은 자동으로 해당 값
        if (difs.length > 1) {
            max = 1;
        } else {
            max = difs[0];
        }

        int checkNum = max;
        while (checkNum < difs[0]) {
            checkNum++;
            boolean check = true;
            // 숫자가 각 위치의 거리에 모두 나누어 떨어지는지 확인
            for (int i = 0; i < difs.length; i++) {
                if (difs[i] % checkNum != 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                max = checkNum;
        }
        
        System.out.println(max);
    }
}
