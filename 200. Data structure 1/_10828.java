import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = new String[Integer.parseInt(br.readLine())];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = br.readLine();
        }

        Stack10828 stack = new Stack10828();

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("pop")) {
                System.out.println(stack.pop());
            } else if (stringArray[i].equals("size")) {
                System.out.println(stack.size());
            } else if (stringArray[i].equals("empty")) {
                System.out.println(stack.empty());
            } else if (stringArray[i].equals("top")) {
                System.out.println(stack.top());
            } else {
                String[] pushString = stringArray[i].split(" ");
                stack.push(Integer.parseInt(pushString[1]));
            }
        }

    }
}

class Stack10828 {
    
    private final int DEFAULT_CAPACITY = 10;    // 기본 용적
    private final int[] EMPTY_ARRAY = {};

    private int size; // 현재 용적
    private int[] array;

    public Stack10828() {
        this.size = 0;
        array = EMPTY_ARRAY;
    }

    public Stack10828(int size) {
        this.size = 0;
        this.array = new int[size];
    }

    private void resize() {
        // 비었을 경우
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new int[DEFAULT_CAPACITY];
            return;
        }

        int currentCapacity = array.length;
        
        if (size == currentCapacity) {
            array = Arrays.copyOf(array, currentCapacity * 2);
            return;
        }

        if (size < (currentCapacity / 2)) {
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, currentCapacity / 2));
            return;
        }
    }
    
    public void push(int value) {
        if (size == array.length) {
            resize();
        }

        array[size] = value;
        size++;
        return;
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }

        int returnValue = array[size - 1];
        // array[size = 1] = null;
        size--;
        resize();
        return returnValue;
    }

    public int size() {
        return size;
    }

    public int empty() {
        if (size == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int top() {
        if (size == 0) {
            return -1;
        } else {
            return array[size - 1];
        }
    }
}
