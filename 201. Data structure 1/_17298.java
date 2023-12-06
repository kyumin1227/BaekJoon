import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < N; i++) {
            int target = array[i];

            if(array[stack.peek()] >= target) {
                stack.push(i);
            } else {
                while(!stack.isEmpty() && array[stack.peek()] < target) {
                    array[stack.pop()] = target;
                }
                stack.push(i);
            }

            if(i == N - 1) {
                while(!stack.isEmpty()) {
                    array[stack.pop()] = -1;
                }
                array[i] = -1;
            }
        }

        for (int i = 0; i < N - 1; i++) {
            bw.write(array[i] + " ");
        }
        bw.write(Integer.toString(-1));

        bw.flush();
        bw.close();
    }
}
