import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Double[] num = new Double[N];
        for(int i = 0; i < N; i++) {
            num[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                stack.push(num[s.charAt(i) - 65]);
            } else {
                Double num2 = stack.pop();
                Double num1 = stack.pop();

                Double answerNum = 0.0;

                switch (s.charAt(i)) {
                    case '+':
                        answerNum = num1 + num2;
                        break;
                    case '-':
                        answerNum = num1 - num2;
                        break;
                    case '*':
                        answerNum = num1 * num2;
                        break;
                    case '/':
                        answerNum = num1 / num2;
                        break;
                }
                stack.push(answerNum);
            }
        }

        System.out.printf("%.2f", stack.pop());
    }
}
