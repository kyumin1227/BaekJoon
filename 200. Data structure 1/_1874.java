import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class _1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] targetArray = new int[n]; // 만들어야 하는 수열
        int[] numArray = new int[n];    // 스택에 추가할 수열
        for (int i = 0; i < n; i++) {
            targetArray[i] = Integer.parseInt(br.readLine());
            numArray[i] = i + 1;
        }

        Stack<Integer> stack = new Stack<>();

        int targetCount = 0;    // targetArray의 인덱스
        int numCount = 0;   //  numArray의 인덱스
        boolean isSuccess = true;

        ArrayList<Character> answerList = new ArrayList<>();

        while(targetCount < n) {
            if(stack.size() == 0 && numCount < n) {
                stack.push(numArray[numCount]);
                numCount++;
//                bw.write("+\n");
                answerList.add('+');
            }
            if(targetArray[targetCount] == stack.peek()) {
                stack.pop();
                targetCount++;
//                bw.write("-\n");
                answerList.add('-');
            } else if (numCount < n) {
                stack.push(numArray[numCount]);
                numCount++;
//                bw.write("+\n");
                answerList.add('+');
            } else {
                System.out.println("NO");
                isSuccess = false;
                break;
            }
        }

        if (isSuccess) {
            for(int i = 0; i < answerList.size(); i++) {
                System.out.println(answerList.get(i));
            }
        }

//        if(isSuccess) {
//            bw.flush();
//        }
//        bw.close();

    }
}