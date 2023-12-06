import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] answerArray = new int[N];
        int[] countArray = new int[10000010];    // countArray의 index i번은 i + 1의 갯수
        for (int i = 0; i < N; i++) {
            answerArray[i] = Integer.parseInt(st.nextToken());
            countArray[answerArray[i] - 1]++;
        }

        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for(int i = 1; i < N; i++) {
            if(countArray[answerArray[stack.peek()] - 1] >= countArray[answerArray[i] - 1]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && countArray[answerArray[stack.peek()] - 1] < countArray[answerArray[i] - 1]) {
                    answerArray[stack.pop()] = answerArray[i];
                }
                 stack.push(i);
            }

            if(i + 1 == N) {
                while (!stack.isEmpty()) {
                    answerArray[stack.pop()] = -1;
                }
            }
        }

        while (!stack.isEmpty()) {
            answerArray[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            bw.write(answerArray[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
