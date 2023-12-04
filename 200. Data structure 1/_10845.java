import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;   // 마지막에 추가한 값

        while(N-- > 0) {
            String s = br.readLine();

            switch (s) {
                case "pop":
                    if(!queue.isEmpty()) {
                        bw.write(queue.poll() + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    if(queue.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    if(queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if(queue.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(last + "\n");
                    }
                    break;
                default:
                    String[] sArray = s.split(" ");
                    int n = Integer.parseInt(sArray[1]);
                    queue.add(n);
                    last = n;
            }
        }

        bw.flush();
        bw.close();
    }
}
