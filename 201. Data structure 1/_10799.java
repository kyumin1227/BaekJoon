import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int stick = 0;
        int answer = 0;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' && s.charAt(i + 1) == '(') {
//                막대기 추가
                answer++;
                stick++;
            } else if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
//                레이저
                answer += stick;
                i++;
            } else {
//                막대기 끝
                stick--;
            }
        }

        System.out.println(answer);
    }
}
