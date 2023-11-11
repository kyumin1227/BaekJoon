import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2607 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());    // 주어지는 단어의 수

        int[] defaultArray = new int[26];   // 첫번째 단어를 알파벳 수 별로 저장할 배열
        int result = 0; // 비슷한 단어의 개수

        // 첫번째 단어를 알파벳 수 별로 배열에 저장
        String s = br.readLine();
        char[] cArray = s.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            defaultArray[cArray[i] - 65] += 1;
        }

        // 두번째 단어부터 첫번째 단어와 비교
        for (int i = 0; i < N - 1; i++) {
            int[] array = new int[26];  // 두번째 단어부터 알파벳 수 별로 저장할 배열
            int count = 0;  // 첫번째 배열과의 차이
            int check = 0;  // 첫번째 배열과의 차이값
            s = br.readLine();
            cArray = s.toCharArray();
            for (int j = 0; j < cArray.length; j++) {
                array[cArray[j] - 65] += 1;
            }

            // 첫번째 배열과 비교
            for (int j = 0; j < array.length; j++) {
                if (defaultArray[j] - array[j] == 0) {
                    // j번째 알파벳이 첫번째 배열과 같은 경우
                } else if (defaultArray[j] - array[j] == 1 || defaultArray[j] - array[j] == -1) {
                    // j번째 알파벳이 첫번째 배열과 1 차이 나는 경우
                    if (count == 0) {
                        // 1차이 나는게 처음일 경우
                        check += defaultArray[j] - array[j];
                        count += 1;
                    } else if (count == 1 && (check += defaultArray[j] - array[j]) == 0) {
                        // 1차이 나는게 처음은 아니지만 앞에서 한번 차이난거랑 상쇄 가능할 경우
                    } else {
                        // 상쇄 불가능
                        count += 1;
                    }
                    
                } else {
                    // j번째 알파벳이 첫번째 배열과 절대값 1 이상 차이 나는 경우
                    count += 2;
                }
            }
            if (count <= 1) {
                // 그래서 배열이 비슷하면 결과값 1 추가
                result += 1;
            }
        }
        
        System.out.println(result);
    }
}
