package easy;

import java.util.Scanner;

public class _1550 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String hex = sc.next();

        sc.close();

        int result = Integer.parseInt(hex, 16);

        System.out.println(result);
    }
}
