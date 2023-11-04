package List;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        System.out.println(list.indexOf(2));
        list.addFirst(3);   // [3, 0, 1, 2]
        System.out.println(list.contains(3));   // false???
        System.out.println(list.indexOf(3));
        System.out.println(list.remove(0));
        System.out.println(list.contains(3));
    }
}
