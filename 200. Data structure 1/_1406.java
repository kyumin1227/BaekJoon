import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] array = br.readLine().toCharArray();
        ArrayList<Character> answer = new ArrayList<>();
        for(char c : array) {
            answer.add(c);
        }
        int M = Integer.parseInt(br.readLine());    // 명령어 수
        int cursor = answer.size(); // 커서 위치

//        명령어 수행
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(s.equals("L")) {
                if(cursor > 0)
                    cursor--;
            } else if (s.equals("D")) {
                if(cursor < answer.size())
                    cursor++;
            } else if (s.equals("B")) {
                if(cursor != 0 && answer.size() != 0) {
                    answer.remove(cursor - 1);
                    cursor--;
                }
            } else {
                String[] sArray = s.split(" ");
                char[] c = sArray[1].toCharArray();
                answer.add(cursor, c[0]);
                cursor++;
            }
        }

//        출력할 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (char c : answer) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
