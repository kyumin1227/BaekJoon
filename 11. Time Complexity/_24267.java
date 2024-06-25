import java.util.Scanner;

public class _24267 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        long n = sc.nextLong();
        sc.close();
        
        long count = menOfPassionFormula(n);
        System.out.println(count);
        System.out.println(3);
    }

    public static long menOfPassionFormula(long n) {
        
        long count = ((n - 2) * (n - 1) * n) / 6;
        
        return count;

    }

    public static int menOfPassion(int n) {

        int count = 0;
        
        for(int i = 1; i <= n - 2; i++) {
            for(int j = i + 1; j <= n - 1; j++) {
                for(int k = j + 1; k <= n; k++) {
                    count += 1;
                }
            }
        }
        
        return count;
    }
}