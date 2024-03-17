import java.util.Scanner;

public class _13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        boolean[] arr = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            int num = i;
            while (num <= n) {
                if (arr[num] == true) {
                    arr[num] = false;
                } else {
                    arr[num] = true;
                }
                num += i;
            }
        }

        int count = 0;
        for (boolean b : arr) {
            if (b == false) {
                count++;
            }
        }

        System.out.println(count - 1);
        
    }
}
