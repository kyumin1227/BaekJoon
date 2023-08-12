import java.util.Scanner;

public class _2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arrayA = new int[N][M];
        int[][] arrayB = new int[N][M];

        int[][] arrayC = new int[N][M]; // 정답 배열

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrayA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrayB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrayC[i][j] = arrayA[i][j] + arrayB[i][j];
                System.out.print(arrayC[i][j] + " ");
            }
            System.out.println();
        }

    }
}
