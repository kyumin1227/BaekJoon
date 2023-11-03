import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<Long, String> store = new HashMap<>();

        long sequence = 0L;

        for (int i = 0; i < 10; i++) {
            ++sequence;
            store.put(sequence, "test");
        }

        System.out.println(store.values());
        System.out.println(store.values().stream().findAny());
    }
}