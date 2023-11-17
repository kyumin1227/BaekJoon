import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack_9012 stack = new Stack_9012(br.readLine());
            stack.check();
            System.out.println(stack.getIsVPS() ? "YES" : "NO");
        }
    }
}

class Stack_9012 {
    
    private String string;
    private boolean isVPS = true;

    public Stack_9012(String s) {
        this.string = s;
    }

    public boolean getIsVPS() {
        return isVPS;
    }

    public void check() {
        int checkNum = 0;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (charArray[i] == '(') {
                checkNum++;
            } else {
                checkNum--;
            }
            if (checkNum < 0) {
                isVPS = false;
            }
        }
        if (checkNum != 0) {
            isVPS = false;
        }
    }
    
}
