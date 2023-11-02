package List;

import java.util.Arrays;

import List.List;

public class ArrayList<E> implements List<E> {
    
    private static final int DEFAULT_CAPACITY = 10; // 최소(기본) 용적 크기 (용적이 0일 경우 확장할 크기)
    private static final Object[] EMPTY_ARRAY = {}; // 빈 배열

    private int size; // 요소 개수  (용적 크기가 아님!!!)
    
    Object[] array; // 요소를 담을 배열

    // 생성자1 (초기공간 할당 X)
    public ArrayList() {
        this.array = EMPTY_ARRAY;
        this.size = 0;
    }

    // 생성자2 (초기 공간 할당 O)
    public ArrayList(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }
    
    // 최적의 용적으로 변경하는 메소드
    private void resize() {
        int array_capacity = array.length;

        // array의 용적이 0일 경우
        if (Arrays.equals(array, EMPTY_ARRAY)) {
            array = new Object[DEFAULT_CAPACITY];
            return;
        }

        // 용량이 꽉 찰 경우
        if (size == array_capacity) {
            int new_capacity = array_capacity * 2;

            // copy 
            array = Arrays.copyOf(array, new_capacity); // copyOf의 첫 파라미터는 원본 배열, 두번째 파라미터는 새로운 배열의 길이로 만약 이 값이 원본 배열의 길이보다 크다면 그 차를 0 또는 기본값으로 초기화 하여 배열을 확장 시킨다
            return;
        }

        // 용적의 절반 미만으로 요소가 차지하고 있을 경우
        if (size < (array_capacity / 2)) {
            int new_capacity = array_capacity / 2;

            // copy
            array = Arrays.copyOf(array, Math.max(new_capacity, DEFAULT_CAPACITY));
            return;
        }

    }

    @Override
    public boolean add(E value) {
        addLast(value);
        return true;
    }

    public void addLast(E value) {
        // 용적 검사
        if (size == array.length) {
            resize();
        }
        array[size] = value;
        size++;
    }

    @Override
    public void add(int index, E value) {
        if (index > size || index < 0) { // index가 사이즈 보다 크거나 0 미만일 경우 예외 발생
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            addLast(value);
        } else {
            if (size == array.length) {
                resize();
            }

            // index 기준 후자에 있는 모든 요소를 한 칸씩 뒤로 밀기
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = value;
            size++;
        }

    }
    
    public void addFirst(E value) {
        add(0, value);
    }
    
    @SuppressWarnings("unchecked")  // 타입 안정성에 대한 경고 무시 (타입이 보장되는 경우에만 사용)
    @Override
    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (E) array[index]; // array는 Object 타입이기 때문에 E 타입으로 캐스팅 후 반환
    }
    
    @Override
    public void set(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            array[index] = value;
        }
    }

    @Override
    public int indexOf(Object value) {
        int i = 0;

        for (i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }

        // 일치하는 값이 없을 경우 -1 반환
        return -1;
    }

    // 마지막 index 부터 검색
    public int lastIndexOf(Object value) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }
    
    public boolean contains(Object value) {
        if (indexOf(value) > 0) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")  // 캐스팅 경고 표시 무시
    @Override
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        E element = (E) array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
        size--;
        resize();
        return element;
    }
    
    @Override
    public boolean remove(Object value) {
        // 삭제할 인덱스 찾기
        int index = indexOf(value);

        if (index == -1) {
            return false;
        }

        remove(index);
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        resize();
    }
}
