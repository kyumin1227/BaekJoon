import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append(br.readLine());
        int M = Integer.parseInt(br.readLine());    // 명령어 수
        int cursor = sb.length(); // 커서 위치

//        명령어 수행
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(s.equals("L")) {
                if(cursor > 0)
                    cursor--;
            } else if (s.equals("D")) {
                if(cursor < sb.length())
                    cursor++;
            } else if (s.equals("B")) {
                if(cursor != 0 && sb.length() != 0) {
                    sb.deleteCharAt(cursor - 1);
                    cursor--;
                }
            } else {
                String[] sArray = s.split(" ");
                sb.insert(cursor, sArray[1]);
                cursor++;
            }
        }

        System.out.println(sb);
    }
}
