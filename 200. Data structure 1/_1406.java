import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        왼쪽 스택과 오른쪽 스택을 만들어 커서 위치 확인
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        for (char c : br.readLine().toCharArray()) {
            leftStack.push(c);
        }
        int M = Integer.parseInt(br.readLine());    // 명령어 수

//        명령어 수행
        while (M-- > 0) {
            String s = br.readLine();
            if(s.equals("L")) {
                if(leftStack.size() > 0)
                    rightStack.push(leftStack.pop());
            } else if (s.equals("D")) {
                if(rightStack.size() > 0)
                    leftStack.push(rightStack.pop());
            } else if (s.equals("B")) {
                if(leftStack.size() > 0) {
                    leftStack.pop();
                }
            } else {
                leftStack.push(s.charAt(2));
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (rightStack.size() > 0) {
            leftStack.push(rightStack.pop());
        }

        for (char c : leftStack) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
    }
}
