import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> answer = new LinkedList<>();
        for (char c : br.readLine().toCharArray()) {
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
                answer.add(cursor, s.charAt(2));
                cursor++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char c : answer) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}
