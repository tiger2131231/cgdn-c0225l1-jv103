package ss10_Java_collection_Framework.bai_tap.bai1;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index);
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Index: " + index);
        E removed = (E) elements[index];
        int moveCount = size - index - 1;
        if (moveCount > 0)
            System.arraycopy(elements, index + 1, elements, index, moveCount);
        elements[--size] = null;
        return removed;
    }

    public int size() {
        return size;
    }

    public E clone() {
        MyArrayList<E> cloned = new MyArrayList<>(elements.length);
        cloned.size = this.size;
        System.arraycopy(this.elements, 0, cloned.elements, 0, this.size);
        return (E) cloned;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) return i;
        }
        return -1;
    }

    public E get(int i) {
        if (i < 0 || i >= size) throw new IndexOutOfBoundsException("Index: " + i);
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            Object[] newElements = new Object[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
