package List;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<E> implements StackInterface<E> {
    
    private static final int DEFAULT_CAPACITY = 10; // 최소(기본) 용적 크기
    private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

    private Object[] array; // 요소를 담을 배열
    private int size; // 요소 개수
    
    // 생성자1 (초기 공간 할당 X)
    public Stack() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }

    // 생성자2 (초기 공간 할당 O)
    public Stack(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }

    private void resize() {

        // 빈 배열일 경우 (capacity is 0)
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        int arrayCapacity = array.length; // 현재 용적 크기

        // 용적이 가득 찰 경우
        if (size == arrayCapacity) {
            int newSize = arrayCapacity * 2;

            // 배열 복사
            array = Arrays.copyOf(array, newSize);
            return;
        }

        // 용적의 절반 미만으로 요소가 차지하고 있을 경우
        if (size < (arrayCapacity / 2)) {
            int newCapacity = (arrayCapacity / 2);

            // 배열 복사
            array = Arrays.copyOf(array, Math.max(DEFAULT_CAPACITY, newCapacity));
            return;
        }
    }

    @Override
    public E push(E item) {

        // 용적이 꽉 찼을 경우 용적 재할당
        if (size == array.length) {
            resize();
        }
        array[size] = item;
        size++;
        return item;
    }

    @Override
    public E pop() {
        // 삭제할 요소가 없는 경우에는 예외 발생
        if (size == 0) {
            throw new EmptyStackException();
        }

        E item = (E) array[size - 1];
        array[size - 1] = null;
        size--;
        resize();
        return item;
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        return (E) array[size - 1];
    }
    
    @Override
    public int search(Object value) {
        if (value == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return size - i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(value)) {
                    return size - i;
                }
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        // 저장된 모든 배열을 명시적으로 null 처리
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }

        size = 0;
        resize();
    }

    @Override
    public boolean empty() {
        return size == 0;
    }
}
