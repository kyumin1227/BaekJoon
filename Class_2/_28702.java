import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _28702 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String line;
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            line = br.readLine();
            if (!line.equals("Fizz") && !line.equals("Buzz") && !line.equals("FizzBuzz")){
                answer = Integer.parseInt(line) + 3 - i;
                break;
            }
        }

        if (answer % 5 == 0 && answer % 3 == 0) {
            System.out.println("FizzBuzz");
        } else if (answer % 3 == 0) {
            System.out.println("Fizz");
        } else if (answer % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(answer);
        }

    }
}
