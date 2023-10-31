import java.util.Scanner;

public class _10926 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inputValue = sc.next();
        
        if(inputValue.length()<=50) {
            boolean chaeckTrue = true;
            char[] arr = inputValue.toCharArray();
            for(int i=0; i<inputValue.length(); i++) {
                int a = arr[i];
                if(a>=97 && a<=122) {
                    
                } else {
                    chaeckTrue = false;
                }
            }
            if(chaeckTrue) {
                System.out.println(inputValue+"??!");
            }
        }
    }
}
