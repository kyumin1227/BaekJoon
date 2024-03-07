package DP;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    
    public static int fibo(int x) {
        if (x == 1 || x == 2)
            return 1;
        return fibo(x - 1) + fibo(x - 2);
    }
}
