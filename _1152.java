import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class _1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringTokenizer st = new StringTokenizer(S);
        ArrayList<String> array = new ArrayList<>();
        
        System.out.println(st.countTokens());
        
    }
}
