import java.util.Scanner;

public class _2447 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();

        boolean[][] star_list = new boolean[n][n];

        star(n, n, 0, 0, star_list);

        for (boolean[] line : star_list) {
            for (boolean b : line) {
                if (b == true) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
    }

    public static boolean star(int size, int now_size, int start_x, int start_y, boolean[][] target_list) {
        // size가 1이 되면 종료
        if (now_size == 1) {
            return false;
        }
    
        int target_x = start_x + now_size / 3;
        int target_y = start_y + now_size / 3;
    
        for (int x = target_x; x < target_x + now_size / 3; x++) {
            for (int y = target_y; y < target_y + now_size / 3; y++) {
                target_list[y][x] = true;
            }
        }
    
        if (start_x + now_size == size && start_y + now_size == size) {
            return star(size, now_size / 3, 0, 0, target_list);
        }

        if (start_x + now_size == size) {
            return star(size, now_size, 0, start_y + now_size, target_list);
        } else {
            return star(size, now_size, start_x + now_size, start_y, target_list);
        }

    }
}
