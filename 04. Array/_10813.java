import java.util.Scanner;

public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // 바구니 개수
        int[] basket = new int[N];
        int M = sc.nextInt();       // 공을 교환 할 횟수

        for(int i = 0; i < N; i++) {    // 바구니에 번호에 해당하는 값을 부여
            basket[i] = i+1;
        }
        int exchange = 0;
        for(int i = 0; i<M; i++) {              // 교환할 바구니의 번호를 받고 해당 바구니의 값을 교환
            int inputA = sc.nextInt() - 1;
            int inputB = sc.nextInt() - 1;
            exchange = basket[inputA];
            basket[inputA] = basket[inputB];
            basket[inputB] = exchange;
        }
        for(int i = 0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
