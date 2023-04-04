import java.util.Scanner;

public class _10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int i, j, k, basketF;
        int[] basketC;

        int[] basket = new int[N];

        for (int ii = 0; ii < N; ii++) {
            basket[ii] = ii + 1;
        }

        for (int ii = 0; ii < M; ii++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            basketC = basket.clone();
            for (int jj = 0; jj < k - i; jj++) {
                basketF = basket[i - 1];
                for (int kk = 0; kk < j - i; kk++) {
                    basket[i + kk - 1] = basket[i + kk];
                }
                basket[j - 1] = basketF;
            }
        }
        for (int l : basket) {
            System.out.print(l + " ");
        }
    }
}
