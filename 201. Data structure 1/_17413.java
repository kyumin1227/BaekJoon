import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder(); // 출력할 스트링

        Stack<Character> stack = new Stack<>(); // 뒤집을 스택

        boolean isReverse = true;   // 뒤집을지 말지

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '<') {
//                열린 꺽새일 경우 isReverse를 false로 변경 후 stack의 모든 값 저장
                isReverse = false;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            } else if(s.charAt(i) == '>') {
//                닫힌 꺽새일 경우 isReverse를 true로 변경 후 sb에 저장
                isReverse = true;
                sb.append(s.charAt(i));
                continue;
            } else if(s.charAt(i) == ' ') {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(s.charAt(i));
                continue;
            }

            if(!isReverse) {
                sb.append(s.charAt(i));
            } else {
                stack.add(s.charAt(i));
            }

//            반복문의 마지막일 때 stack에 값이 남아있다면 모두 StringBuilder에 추가
            if(i == s.length() - 1) {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        System.out.println(sb);
    }
}
