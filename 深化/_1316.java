import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 단어의 개수
        int count = 0;

        for (int i = 0; i < N; i++) {
            boolean[] check = new boolean[26]; // 해당 알파벳이 나왔으면 true
            boolean group = true; // 단어가 그룹이면 true, 아니면 false

            String word = sc.next();
            char[] wordChar = word.toCharArray();

            for (int j = 0; j < word.length(); j++) {
                // 단어가 그룹 단어가 아닌 경우 (j번째 알파벳이 나온적이 있는데 j번째 알파벳이 j-1번째 알파벳과 다른 경우)
                if (check[wordChar[j] - 97] == true && wordChar[j] != wordChar[j - 1]) {
                    group = false;
                    continue;
                } else {
                    check[wordChar[j] - 97] = true;
                }
            }
            if (group == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}