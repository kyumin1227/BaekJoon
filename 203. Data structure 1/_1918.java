import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp >= 'A' && temp <= 'Z') {
                sb.append(temp);
            } else if(temp == ')') {
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
            } else if(temp == '(') {
                stack.push(temp);
            } else {
                if(!stack.isEmpty() && priority(temp) > priority(stack.peek())) {
                    stack.push(temp);
                } else {
                    while(!stack.isEmpty() && priority(temp) <= priority(stack.peek())) {
                        sb.append(stack.pop());
                    } stack.push(temp);
                }
            }
        }

        while(!stack.empty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }

    public static int priority(char temp) {
        if(temp == '(') {
            return 0;
        } else if (temp == '+' || temp == '-') {
            return 1;
        } else {
            return 2;
        }
    }
}
