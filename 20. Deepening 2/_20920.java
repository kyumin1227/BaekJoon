import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import List.List;

public class _20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            
            if (word.length() < m) {
                continue;
            }

            if (wordMap.get(word) == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, wordMap.get(word) + 1);
            }
        }

        List<String> sortedList = wordMap.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
        .thenComparing(Map.Entry.comparingByKey(Comparator.comparingInt(String::length).reversed()))
        .thenComparing(Map.Entry.comparingByKey()))
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());

        for (String string : sortedList) {
            System.out.println(string);
        }

    }
}
