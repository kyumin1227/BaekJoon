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
        int[] basketR = new int[N];  // 뒤집은 값을 저장 할 바구니
        int basketF, basketL;        // 변경할 첫 바구니와 마지막 바구니
        for(int i = 0; i<M; i++) {
            basketF = sc.nextInt();
            basketL = sc.nextInt();
            int count = 1;
            for(int j = basketF-1; j<basketL; j++) {    // 바구니의 순서를 basketR 배열에 저장
                basketR[j] = basket[j];
            }
            for(int j = basketF-1; j<basketL; j++) {    // 바구니의 값을 basketR 배열에서 역순으로 가져옴
                basket[j] = basketR[basketL-count];
                count++;
            }
            
        }
        for(int i = 0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
