import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[10];                            // 숫자를 받을 배열
        for(int i = 0; i<10; i++) {
            num[i] =sc.nextInt();
        }
        int[] remainder = new int[10];                      // 나머지 값을 저장할 배열
        for(int i = 0; i<10; i++) {
            remainder[i] = num[i] % 42;
        }
        int count=43;                                       // 같은 값은 count 값으로 변화 시키고 변화 시켰단걸 확인하기 위해 count를 +1 해줌
        for(int i = 0; i<10; i++) {                         // 즉 count 값에서 원래 값인 43을 빼면 변화 시킨 횟수 = 서로 다른 나머지의 개수
            if(remainder[i] < 42) {
                for(int j = i+1; j<10; j++) {
                    if(remainder[i]==remainder[j]) {
                        remainder[j] = count;
                    }
                }
                remainder[i] = count;
                count+=1;
            }
            
        }
        System.out.println(count-43);
    }
}
