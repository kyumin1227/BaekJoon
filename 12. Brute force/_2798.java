import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 최대 합

        int sum;
        int max = 0;

        s = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(s);
        int[] cards = new int[N];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = Integer.parseInt(st2.nextToken());
        }
        
        loopOut:
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int z = j + 1; z < cards.length; z++) {
                    sum = cards[i] + cards[j] + cards[z];
                    if (sum > max && sum <= M) {
                        max = sum;
                    }
                    if (max == M) {
                        break loopOut;
                    }
                }
            }
        }
        System.out.println(max);
        
    }
}
