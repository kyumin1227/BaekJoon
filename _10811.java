import java.util.Scanner;

public class _10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];   // 바구니 생성
        for(int i = 0; i<N; i++) {
            basket[i] = i+1;
        }
        int[] basketR = new int[N];
        int basketF, basketL;        // 변경할 첫 바구니와 마지막 바구니
        for(int i = 0; i<M; i++) {
            basketF = sc.nextInt();
            basketL = sc.nextInt();
            int count = 1;
            for(int j = basketF-1; j<basketL; j++) {
                basketR[j] = basket[j];
            }
            for(int j = basketF-1; j<basketL; j++) {
                basket[j] = basketR[basketL-count];
                count++;
            }
            
        }
        for(int i = 0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
