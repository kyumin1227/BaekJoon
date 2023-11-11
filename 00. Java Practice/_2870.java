import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Collections;
import java.util.ArrayList;

public class _2870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        ArrayList<BigInteger> numArray = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            ArrayList<BigInteger> result = extractionNum.extraction(s);
            for (int j = 0; j < result.size(); j++) {
                numArray.add(result.get(j));
            }
        }

        Collections.sort(numArray);

        
        for (int i = 0; i < numArray.size(); i++) {
            System.out.println(numArray.get(i));
        }


    }
}

class extractionNum {

    public static ArrayList extraction(String s) {
        ArrayList<BigInteger> array = new ArrayList<>();

        char[] cArray = s.toCharArray();
        String num = "";

        for (int i = 0; i < cArray.length; i++) {
            if (cArray[i] >= 48 && cArray[i] <= 57) {
                num += cArray[i];
            } else {
                if (num.length() > 0) {
                    array.add(new BigInteger(num));
                }
                
                num = "";
            }
        }

        if (num.length() > 0) {
            array.add(new BigInteger(num));
        }

        return array;
    }
}