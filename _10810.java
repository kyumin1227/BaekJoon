import java.util.Scanner;

public class _10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();               // 바구니의 개수
        int M = sc.nextInt();               // 공을 넣을 횟수

        int[] basket = new int[N];
        int firstBasket, lastBasket, number;
        for(int i = 0; i<M; i++) {
            firstBasket = sc.nextInt();
            lastBasket = sc.nextInt();
            number = sc.nextInt();
            for(int j = 0; j<lastBasket-firstBasket+1; j++) {              
                basket[j+firstBasket-1] = number;
            }
        }
        for(int i = 0; i<N; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
