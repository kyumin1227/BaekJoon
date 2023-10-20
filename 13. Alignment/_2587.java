import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        int[] minArray = new int[3];
        for (int i = 0; i < minArray.length; i++) {
            minArray[i] = 100;
        }
        int sum = 0;
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
            sum += array[i];
            for (int j = 2; j >= 0; j--) {
                if (array[i] < minArray[j]) {
                    if (j < 2) {
                        int num = minArray[j];
                        minArray[j] = array[i];
                        minArray[j + 1] = num;
                    } else {
                        minArray[j] = array[i];
                    }
                }
            }
        }

        System.out.println(sum / 5 + "\n" + minArray[2]);
        
    }
}
