import java.util.Scanner;

public class _9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String[] array = new String[num];
        for(int i = 0; i<num; i++) {
            array[i] = sc.next();
        }
        for(int i = 0; i<num; i++) {
            System.out.println(array[i].charAt(0)+""+array[i].charAt(array[i].length()-1));
        }
    }
}
