import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(!deque.isEmpty()) bw.write(Integer.toString(deque.removeFirst()));
                    else bw.write(Integer.toString(-1));
                    bw.write("\n");
                    break;
                case "pop_back":
                    if(!deque.isEmpty()) bw.write(Integer.toString(deque.removeLast()));
                    else bw.write(Integer.toString(-1));
                    bw.write("\n");
                    break;
                case "size":
                    bw.write(Integer.toString(deque.size()));
                    bw.write("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()) bw.write(Integer.toString(1));
                    else bw.write(Integer.toString(0));
                    bw.write("\n");
                    break;
                case "front":
                    if(!deque.isEmpty()) bw.write(Integer.toString(deque.getFirst()));
                    else bw.write(Integer.toString(-1));
                    bw.write("\n");
                    break;
                case "back":
                    if(!deque.isEmpty()) bw.write(Integer.toString(deque.getLast()));
                    else bw.write(Integer.toString(-1));
                    bw.write("\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
