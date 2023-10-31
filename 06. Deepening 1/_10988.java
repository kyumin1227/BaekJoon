import java.util.Scanner;

public class _10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        char[] array = input.toCharArray();

        int answer = 1;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - i - 1]) {

            } else {
                answer = 0;
            }
        }
        System.out.println(answer);
    }
}
