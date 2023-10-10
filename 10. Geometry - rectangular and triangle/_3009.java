// 문제
// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

// 입력
// 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

// 출력
// 직사각형의 네 번째 점의 좌표를 출력한다.

import java.util.Scanner;

public class _3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] xArray = new int[2];
        int[] yArray = new int[2];

        for (int i = 0; i < 2; i++) {
            xArray[i] = sc.nextInt();
            yArray[i] = sc.nextInt();
        }

        if (x == xArray[0]) {
            System.out.print(xArray[1]);
        } else if (x == xArray[1]) {
            System.out.print(xArray[0]);
        } else {
            System.out.print(x);
        }

        System.out.print(" ");

        if (y == yArray[0]) {
            System.out.print(yArray[1]);
        } else if (y == yArray[1]) {
            System.out.print(yArray[0]);
        } else {
            System.out.print(y);
        }
    }
}
