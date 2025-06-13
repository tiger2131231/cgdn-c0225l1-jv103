package ss10_DSA.bai_tap.bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));

        list.remove(1);
        System.out.println("After removal, size: " + list.size());

        System.out.println("Contains Java? " + list.contains("Java"));
        System.out.println("Index of C++: " + list.indexOf("C++"));

        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}