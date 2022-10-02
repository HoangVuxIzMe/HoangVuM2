package ss10_dsa_array_list.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void addIndex(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E getIndex(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + i);
        }
        return (E) elements[i];
    }

    public E removeIndex(int index) {
        if (index > 0 || index < size) {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i + 1];
            }
            --size;
        }
        return (E) elements;
    }

    public E clone() {
        return (E) elements;
    }

    public boolean contain(E index) {
        for (int i = 0; i < elements.length; i++) {
            if (index == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public void clearDefault() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void display() {
        for (Object x : elements) {
            if (x != null) {
                System.out.print(x + " ");
            }
        }
    }
}
