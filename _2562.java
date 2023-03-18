import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];

        int numMax = 0;
        int maxIndex = 0;

        for(int i = 0;i<9; i++) {
            array[i] = sc.nextInt();
            if(array[i]>numMax) {
                numMax = array[i];
                maxIndex = i+1;
            }
        }
        System.out.println(numMax);
        System.out.println(maxIndex);
    }
}
