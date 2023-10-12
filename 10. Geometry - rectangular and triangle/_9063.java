import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class _9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] xArray = new int[N];
        int[] yArray = new int[N];

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);

        xArray[0] = Integer.parseInt(st.nextToken());
        yArray[0] = Integer.parseInt(st.nextToken());

        // 기본값 세팅
        int maxX = xArray[0];
        int minX = xArray[0];
        int maxY = yArray[0];
        int minY = yArray[0];

        for (int i = 1; i < N; i++) {
            s = bf.readLine();
            StringTokenizer st2 = new StringTokenizer(s);

            xArray[i] = Integer.parseInt(st2.nextToken());
            yArray[i] = Integer.parseInt(st2.nextToken());

            if (xArray[i] > maxX)
                maxX = xArray[i];
            if (xArray[i] < minX)
                minX = xArray[i];
            if (yArray[i] > maxY)
                maxY = yArray[i];
            if (yArray[i] < minY)
                minY = yArray[i];
        }

        System.out.println((maxX - minX) * (maxY - minY));
    }
}
