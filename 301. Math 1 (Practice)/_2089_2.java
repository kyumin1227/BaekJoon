import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _2089_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> result = new Stack<>();

        while (N != 0) {
            result.push(N % -2);
            N /= -2;
        }
        
        while (!result.isEmpty()) {
            System.out.print(result.pop());
        }
    }
}
